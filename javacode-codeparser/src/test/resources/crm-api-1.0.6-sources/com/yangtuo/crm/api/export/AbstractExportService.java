package com.yangtuo.crm.api.export;

import com.alibaba.fastjson.JSON;
import com.aliyun.oss.OSSClient;
import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.export.result.AbstractResult;
import com.yangtuo.crm.domain.export.result.ExportTaskTO;
import com.yt.asd.common.concurrent.AsdThreadPoolImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author qiyu
 * @date 2018/5/16
 */
public abstract class AbstractExportService<S, V extends AbstractResult> {

    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    /**
     * 分页查询
     */
    public abstract ResultData<List<V>> page(S s, Object orderBy);

    /**
     * 返回查询结果的对象类
     */
    public abstract Class<V> getV();

    /**
     * 返回查询条件的对象
     */
    public abstract Class<S> getS();

    /**
     * bean初始化方法,init(String type),重启服务器挂掉时正在运行的任务
     */
    public abstract void init();

    public abstract String getOssBucketName();

    public abstract CrmExportTaskApi getExportTaskApi();

    public abstract AsdThreadPoolImpl getAsdThreadPool();

    public abstract OSSClient getOssClient();

    /**
     * 全量
     */
    ResultData handleAll(S s, Handler<V> handler) {
        Object orderByValue = null;
        while (true) {
            ResultData<List<V>> resultData = page(s, orderByValue);
            if (!resultData.isSuccess()) {
                log.error("AbstractExportService page error param:{},service{}",
                        JSON.toJSONString(s), this.getClass());
                return resultData;
            }
            List<V> list = resultData.getDefaultModel();
            if (CollectionUtils.isEmpty(list)) {
                break;
            }
            Integer total = threadLocal.get();
            if (total == null) {
                threadLocal.set(list.size());
            } else {
                threadLocal.set(total + list.size());
            }
            log.info("excel导出数据为{}", threadLocal.get());
            ResultData<V> handleResult = handler.handle(list);
            if (!handleResult.isSuccess()) {
                return handleResult;
            }
            V last = list.get(list.size() - 1);
            orderByValue = last.getOrderByValue();
        }
        threadLocal.remove();
        return new ResultData<>().setCode(ResultData.SUCCESS_CODE);
    }

    public ResultData export(S s, String userId, String type, String email) {
        ResultData<ExportTaskTO> resultData = getExportTaskApi()
                .addTask(JSON.toJSONString(s), userId, type,
                        IPUtil.getServerIp(), email);
        if (!resultData.isSuccess()) {
            return resultData;
        }
        getAsdThreadPool().submit(newThread(s, resultData.getData(), this));
        return ResultData.writeForSuccess(null);
    }

    public void init(String type) {
        ResultData<List<ExportTaskTO>> resultData = getExportTaskApi()
                .queryUnfinishedTask(IPUtil.getServerIp(), type);
        if (!resultData.isSuccess()) {
            throw new RuntimeException("获取未完成导出任务失败");
        }
        resultData.getData().forEach(data -> getAsdThreadPool()
                .submit(newThread(JSON.parseObject(data.getFormJSON(), this.getS()), data, this)));
    }

    private Runnable newThread(S s, ExportTaskTO to, AbstractExportService exportService) {
        return () -> {
            Date now = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            String ossKey = to.getType() + "/" + simpleDateFormat.format(now) + "/" + to.getType() + "-" + now.getTime();
            try {
                ResultData<String> resultData = ExcelUtils
                        .export(s, exportService, getOssClient(), getOssBucketName(), ossKey);
                to.setFinishTime(new Date());
                if (resultData.isSuccess()) {
                    getExportTaskApi().exportSuccess(to.getId(), new Date(), getOssBucketName(), ossKey);
                } else {
                    getExportTaskApi().exportError(to.getId(), new Date());
                }
            } catch (Exception e) {
                log.error("AbstractExportService export error", e);
                to.setFinishTime(new Date());
                getExportTaskApi().exportError(to.getId(), new Date());
            }

        };
    }


}
