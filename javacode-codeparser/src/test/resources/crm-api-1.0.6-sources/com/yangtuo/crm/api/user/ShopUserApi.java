package com.yangtuo.crm.api.user;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.user.ShopUserOptForm;
import com.yangtuo.crm.domain.user.ShopUserQueryForm;

import java.util.Map;

/**
 * 门店用户
 *
 * @author 木鸢
 * @create by 2018-04-12 15:54
 */
public interface ShopUserApi {

    /**
     * 添加门店账号
     * @param userOptForm
     * @return
     */
    public ResultData<String> addShopUser(ShopUserOptForm userOptForm);

    /**
     * 修改门店账号
     * @param userOptForm
     * @return
     */
    public ResultData<String> updateShopUser(ShopUserOptForm userOptForm);


    /**
     * 启用停用账号
     * @param userId
     * @param status 1启用 0停用
     * @return
     */
    public ResultData<String> updateUserStatus(String userId, Integer status);


    /**
     * 门店账号查询
     * @param shopUserQueryForm
     * @return
     */
    public ResultData<Map<String, Object>> queryUser(ShopUserQueryForm shopUserQueryForm);
}
