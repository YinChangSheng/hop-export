package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;
import java.util.List;

/**
 * @author qiyu
 * @date 2018/5/21
 */
public class ShopWrapperNearbyTO implements Serializable {

    private static final long serialVersionUID = 3916761438575125373L;
    /**
     * 门店基础模型
     */
    private CrmShopTo shopTo;

    /**
     * 门店服务人员
     */
    private List<ShopServerTo> shopServers;

    /**
     * 距离（米）
     */
    private Integer distance;

    public CrmShopTo getShopTo() {
        return shopTo;
    }

    public void setShopTo(CrmShopTo shopTo) {
        this.shopTo = shopTo;
    }



    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public List<ShopServerTo> getShopServers() {
        return shopServers;
    }

    public void setShopServers(List<ShopServerTo> shopServers) {
        this.shopServers = shopServers;
    }
}
