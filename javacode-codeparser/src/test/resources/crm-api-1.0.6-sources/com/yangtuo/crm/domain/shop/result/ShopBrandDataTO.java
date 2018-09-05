package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 交易品牌信息
 *
 * @author 木鸢
 * create by 2018-04-10 14:54
 */
public class ShopBrandDataTO implements Serializable{
    private static final long serialVersionUID = -4320956986798078392L;
    private String shopId;
    private String name;
    private long orderAmt;
    /**
     * 上月gmv(此字段暂时无数据)
     */
    private long lastOrderAmt;

    public long getLastOrderAmt() {
        return lastOrderAmt;
    }

    public void setLastOrderAmt(long lastOrderAmt) {
        this.lastOrderAmt = lastOrderAmt;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrderAmt() {
        return orderAmt;
    }

    public void setOrderAmt(long orderAmt) {
        this.orderAmt = orderAmt;
    }
}
