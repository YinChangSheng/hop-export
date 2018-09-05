package com.yangtuo.crm.domain.shop.form;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.io.Serializable;

/**
 * 附近门店
 *
 * @author qiyu
 * @date 2018/5/16
 */
public class ShopDistanceQueryForm extends CrmBaseQuery implements Serializable {

    private static final long serialVersionUID = 6031904857672792324L;

    /**
     * 门店主键
     */
    private String shopId;

    /**
     * 分组主键
     */
    private Long groupId;

    /**
     * 距离
     */
    private Double distance;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
