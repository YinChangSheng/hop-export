package com.yangtuo.crm.api.publicshop;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.publicsea.query.PublicSeaShopQuery;
import com.yangtuo.crm.domain.publicsea.to.PublicSeaShopTO;

import java.util.List;

/**
 * 门店公海
 */
public interface PublicSeaShopApi {

    /**
     * 公海列表查询
     */
    ResultData<List<PublicSeaShopTO>> queryPublicSeaShopList(PublicSeaShopQuery query);

    /**
     * 公海转移
     * @param shopIds       待转移的公海集合
     * @param publicSeaType 公海类型
     */
    ResultData<Boolean> transferPublicSeaShop(List<String> shopIds, Integer publicSeaType);

    /**
     * 领取公海门店
     * @param
     * @return
     */
    ResultData<Boolean> takePublicSeaShop(String shopIds);
}
