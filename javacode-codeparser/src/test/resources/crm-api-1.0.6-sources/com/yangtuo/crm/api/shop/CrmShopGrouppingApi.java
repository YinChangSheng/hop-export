package com.yangtuo.crm.api.shop;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.shop.form.ShopGroupSearchForm;
import com.yangtuo.crm.domain.shop.result.CrmShopGroupMappingTO;
import com.yangtuo.crm.domain.shop.result.CrmShopGroupTO;

import java.util.List;

/**
 * 门店分组接口
 *
 * @author 木鸢
 * @create by 2018-04-16 10:05
 */
public interface CrmShopGrouppingApi {

    /**
     * 门店已添加门店分组列表
     *
     * @param form .shopId
     * @return
     */
    ResultData<List<CrmShopGroupMappingTO>> shopGrouppingList(ShopGroupSearchForm form);

    /**
     * 按分组名称模糊查询门店分组
     *
     * @param form .shopName
     * @return
     */
    ResultData<List<CrmShopGroupMappingTO>> searchGroupByFuzzeName(ShopGroupSearchForm form);

    /**
     * 加入/移除白名单
     *
     * @param shopId
     * @param groupId
     * @param optType 操作类型 1加入 0移除
     * @return
     */
    ResultData<String> addOrRemoveShopGroup(String shopId, Long groupId, Integer optType);

    /**
     * 模糊查询分组信息
     *
     * @param groupName
     * @return
     */
    ResultData<List<CrmShopGroupTO>> findGroupByFuzzeName(String groupName);
}
