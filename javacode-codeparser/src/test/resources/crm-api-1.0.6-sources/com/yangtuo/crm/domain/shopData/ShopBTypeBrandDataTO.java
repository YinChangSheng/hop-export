package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;


/**
 * @author Created by diandian on 2018/5/16.
 */
public class ShopBTypeBrandDataTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String brandName;

    private Long thisMonthGmv;

    private Long lastMonthGmv;

    private Long thisYearGmv;

    private Long brandId;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getThisMonthGmv() {
        return thisMonthGmv;
    }

    public void setThisMonthGmv(Long thisMonthGmv) {
        this.thisMonthGmv = thisMonthGmv;
    }

    public Long getLastMonthGmv() {
        return lastMonthGmv;
    }

    public void setLastMonthGmv(Long lastMonthGmv) {
        this.lastMonthGmv = lastMonthGmv;
    }

    public Long getThisYearGmv() {
        return thisYearGmv;
    }

    public void setThisYearGmv(Long thisYearGmv) {
        this.thisYearGmv = thisYearGmv;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
