package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/3/23.
 */
public class ShopCapacityTO implements Serializable{

    /**
     * 用户id
     */
    private String userId;

    /**
     * 对应用户的门店库容大小
     */
    private Integer maxCapacity;

    /**
     * 对应用户的当前拥有门店的大小
     */
    private Integer nowCapacity;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Integer getNowCapacity() {
        return nowCapacity;
    }

    public void setNowCapacity(Integer nowCapacity) {
        this.nowCapacity = nowCapacity;
    }

}
