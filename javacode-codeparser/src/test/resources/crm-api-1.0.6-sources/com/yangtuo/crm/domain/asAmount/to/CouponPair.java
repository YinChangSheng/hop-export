package com.yangtuo.crm.domain.asAmount.to;

import java.io.Serializable;



/**
 * 服务人员可发券实体
 *
 * @author 木鸢
 * create by 2018-05-23 16:21
 */
public class CouponPair implements Serializable {

    private static final long serialVersionUID = -3836362346456311748L;

    private Integer couponType;

    private String couponDesc;

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }
}

   