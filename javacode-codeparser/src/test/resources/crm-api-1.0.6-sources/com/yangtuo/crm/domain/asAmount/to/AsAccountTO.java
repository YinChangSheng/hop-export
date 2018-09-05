package com.yangtuo.crm.domain.asAmount.to;

import java.io.Serializable;
import java.util.List;

/**
 * 服务人员账户余额(某一种类型余额及对应券)
 *
 * @author 木鸢
 * create by 2018-05-23 16:21
 */
public class AsAccountTO implements Serializable {

    private static final long serialVersionUID = -6882046198786339497L;
    private Integer couponType;
    private Integer accountType;
    private String couponDesc;
    private Integer amount;
    List<CrmCouponTO> couponTOList;

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String couponDesc) {
        this.couponDesc = couponDesc;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public List<CrmCouponTO> getCouponTOList() {
        return couponTOList;
    }

    public void setCouponTOList(List<CrmCouponTO> couponTOList) {
        this.couponTOList = couponTOList;
    }
}
