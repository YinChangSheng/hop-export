package com.yangtuo.crm.api.applyShop;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.applyShop.ApplyShopQuery;
import com.yangtuo.crm.domain.applyShop.form.ApplyShopOptForm;
import com.yangtuo.crm.domain.applyShop.to.ApplyShopDetailTO;
import com.yangtuo.crm.domain.applyShop.to.ApplyShopTO;
import com.yangtuo.crm.domain.shop.form.ToCollaborateForm;

import java.util.List;
import java.util.Map;

/**
 * @author Created by diandian on 2018/4/11.
 */
public interface ApplyShopApi {


    /**
     * 新增商机
     *
     * @param applyShopOptForm
     * @return
     */
    ResultData<Boolean> addApplyShop(ApplyShopOptForm applyShopOptForm);

    /**
     * 更新商机
     *
     * @param applyShopOptForm
     * @return
     */
    ResultData<Boolean> updateApplyShop(ApplyShopOptForm applyShopOptForm);


    /**
     * 查询商机列表
     * @param applyShopQuery
     * @return
     */
    ResultData<List<ApplyShopTO>> queryApplyShopList(ApplyShopQuery applyShopQuery);

    /**
     * 查询商机详情
     * @param shopId
     * @return
     */
    ResultData<ApplyShopDetailTO> queryApplyShopInfo(String shopId);

    /**
     * 批量修改商机服务人员
     * @param userId
     * @param ids
     * @return
     */
    ResultData<Boolean> batchUpdateApplyShopServer(String userId,List<Long> ids,String remark);


    /**
     * 门店转合作
     * @param toCollaborateForm
     * @return
     */
    ResultData<Boolean> transCooperateApplyShop(ToCollaborateForm toCollaborateForm);

    /**
     * 废弃商机
     * @param shopId
     * @return
     */
    ResultData<Boolean> abandonApplyShop(String shopId);

    /**
     * 获取不同状态商机的数量
     * @return
     */
    ResultData<Map<Integer,Long>> queryApplyShopStatusCount(ApplyShopQuery applyShopQuery);

}
