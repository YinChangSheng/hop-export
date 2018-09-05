package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/5/17.
 */
public class ShopOrderTopCategoryDataTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long categoryId;

    private String categoryName;

    private Long thisMonthKjGmv;

    private Long thisMonthDmGmv;

    private Long lastMonthKjGmv;

    private Long lastMonthDmGmv;

    private Long last90daysKjGmv;

    private Long last90daysDmGmv;

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
