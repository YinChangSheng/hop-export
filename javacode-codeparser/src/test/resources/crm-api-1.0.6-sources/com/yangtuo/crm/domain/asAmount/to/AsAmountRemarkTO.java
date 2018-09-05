package com.yangtuo.crm.domain.asAmount.to;

import java.io.Serializable;

/**
 * 账户余额明细备注
 *
 * @author 木鸢
 * @create by 2018-05-24 10:37
 */
public class AsAmountRemarkTO implements Serializable{

    private static final long serialVersionUID = -1379053944306051832L;

    private String remark;
    private String shopId;
    private String shopName;
    private Long couponId;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
}
