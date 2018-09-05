package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/5/16.
 */
public class ShopBTypeCategoryDataTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long categoryId;

    private String categoryName;

    private Long thisMonthGmv;

    private Long lastMonthGmv;

    private Long thisYearGmv;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
}
