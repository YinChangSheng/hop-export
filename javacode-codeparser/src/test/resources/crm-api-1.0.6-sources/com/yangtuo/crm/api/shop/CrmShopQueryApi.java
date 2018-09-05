package com.yangtuo.crm.api.shop;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.shop.form.ShopDistanceQueryForm;
import com.yangtuo.crm.domain.shop.form.ShopQueryForm;
import com.yangtuo.crm.domain.shop.result.*;

import java.util.List;
import java.util.Map;

/**
 * @author 木鸢
 * @create by 2018-04-10 14:30
 */
public interface CrmShopQueryApi {

    /**
     * 门店列表
     *
     * @param queryForm
     * @return
     */
    ResultData<List<ShopWrapperTo>> shopList(ShopQueryForm queryForm);

    /**
     * 查询门店详情
     *
     * @param shopId
     * @return
     */
    ResultData<ShopWrapperTo> queryShopDetail(String shopId);

    ResultData<ShopWrapperTo> queryShopDetailByOption(String shopId, List<String> optionCodes);

    /**
     * 详细交易信息(类目、品牌、商品数据)
     *
     * @param shopId
     * @return
     */
    ResultData<ShopTradeItemTo> queryShopTradeItem(String shopId);

    /**
     * 模糊查找总店
     *
     * @param shopName
     * @param shopId   排查门店id
     * @return
     */
    ResultData<CrmShopTo> searchParentShopByFuzzeName(String shopName, String provinceId, String cityId, String areaId,
                                                      String shopId);

    /**
     * 查询门店操作记录
     *
     * @param shopId
     * @return
     */
    ResultData<CrmShopOptRecordTO> findShopOptRecords(String shopId, Integer pageNo, Integer pageSize);

    /**
     * 查询distance公里内门店
     *
     * @param form
     * @return
     */
    ResultData<List<ShopWrapperNearbyTO>> queryShopByDistance(ShopDistanceQueryForm form);

    /**
     * 根据名称模糊查询
     *
     * @param shopName
     * @return
     */
    ResultData<List<ShopWrapperTo>> queryShopByFuzzeName(String shopName);

    /**
     * 根据userIdList 查询 分店数量
     *
     * @param userIdList
     * @return
     */
    ResultData<Map<String, Integer>> searchJoinShopCountByUserIds(List<String> userIdList);
}
