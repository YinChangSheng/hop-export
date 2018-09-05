package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/5/17.
 */
public class ShopOrderTopBrandDataTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long brandId;

    private String brandName;

    private Long thisMonthKjGmv;

    private Long thisMonthDmGmv;

    private Long lastMonthKjGmv;

    private Long lastMonthDmGmv;

    private Long last90daysKjGmv;

    private Long last90daysDmGmv;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getThisMonthKjGmv() {
        return thisMonthKjGmv;
    }

    public void setThisMonthKjGmv(Long thisMonthKjGmv) {
        this.thisMonthKjGmv = thisMonthKjGmv;
    }

    public Long getThisMonthDmGmv() {
        return thisMonthDmGmv;
    }

    public void setThisMonthDmGmv(Long thisMonthDmGmv) {
        this.thisMonthDmGmv = thisMonthDmGmv;
    }

    public Long getLastMonthKjGmv() {
        return lastMonthKjGmv;
    }

    public void setLastMonthKjGmv(Long lastMonthKjGmv) {
        this.lastMonthKjGmv = lastMonthKjGmv;
    }

    public Long getLastMonthDmGmv() {
        return lastMonthDmGmv;
    }

    public void setLastMonthDmGmv(Long lastMonthDmGmv) {
        this.lastMonthDmGmv = lastMonthDmGmv;
    }

    public Long getLast90daysKjGmv() {
        return last90daysKjGmv;
    }

    public void setLast90daysKjGmv(Long last90daysKjGmv) {
        this.last90daysKjGmv = last90daysKjGmv;
    }

    public Long getLast90daysDmGmv() {
        return last90daysDmGmv;
    }

    public void setLast90daysDmGmv(Long last90daysDmGmv) {
        this.last90daysDmGmv = last90daysDmGmv;
    }
}
