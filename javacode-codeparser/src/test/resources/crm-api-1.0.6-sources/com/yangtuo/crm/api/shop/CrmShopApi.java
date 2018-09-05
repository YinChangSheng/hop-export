package com.yangtuo.crm.api.shop;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.shop.form.AddShopForm;
import com.yangtuo.crm.domain.shop.form.UpdateShopForm;
import com.yangtuo.crm.domain.shop.result.ShopQualificationTo;

/**
 * @author 木鸢
 * @create by 2018-04-10 14:30
 */
public interface CrmShopApi {

    /**
     * 添加门店(crm后台)
     * @param shopOptForm
     * @return
     */
    public ResultData<String> addShop(AddShopForm shopOptForm);

    /**
     * 修改门店
     * @param shopOptForm
     * @return
     */
    public ResultData<String> updateShop(UpdateShopForm shopOptForm);

    /**
     * 资质修改
     * @param shopQualificationTo
     * @return
     */
    public ResultData<String> updateShopQualication(ShopQualificationTo shopQualificationTo);

    /**
     * 微小店开通
     * @param shopId
     * @param status
     * @return
     */
    public ResultData<String> batchUpdateWXShop(String shopId, String status);

    /**
     * 解冻/冻结
     * @param shopId
     * @param optType
     * @deprecated 参数有变,兼容一个版本,下个版本删掉该方法
     * @return
     */
    public ResultData updateShopStatus(String shopId, Integer optType);


    /**
     * 解冻/冻结
     * @param shopId
     * @param optType
     * @return
     */
    public ResultData freezeShop(String shopId, Integer optType, Integer freezeCode, String freezeDesc);



    /**
     * 修改备注
     * @param shopId
     * @param remark
     * @return
     */
    public ResultData<String> upadteRemark(String shopId, String remark);
}
