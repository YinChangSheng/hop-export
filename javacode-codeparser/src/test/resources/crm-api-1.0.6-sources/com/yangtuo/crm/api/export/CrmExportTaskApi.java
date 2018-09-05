package com.yangtuo.crm.api.export;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.export.result.ExportTaskTO;

import java.util.Date;
import java.util.List;

/**
 * @author qiyu
 * @date 2018/5/21
 */
public interface CrmExportTaskApi {

    /**
     * 添加导出任务，如果任务已存在则失败
     *
     * @param userId
     * @param type
     * @return
     */
    ResultData<ExportTaskTO> addTask(String formJSON, String userId, String type, String executor, String email);

    /**
     * 导出任务成功
     *
     * @param id
     * @param finishTime
     * @param ossBucketName
     * @return
     */
    ResultData<Void> exportSuccess(Long id, Date finishTime, String ossBucketName, String ossKey);

    /**
     * 导出任务失败
     *
     * @param id
     * @param finishTime
     * @return
     */
    ResultData<Void> exportError(Long id, Date finishTime);

    /**
     * 查询未执行完的任务
     *
     * @param executor
     * @return
     */
    ResultData<List<ExportTaskTO>> queryUnfinishedTask(String executor, String type);

    /**
     * 查询最后一条任务
     *
     * @param userId
     * @param type
     * @return
     */
    ResultData<ExportTaskTO> getLastTask(String userId, String type);

}
