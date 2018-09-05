package com.yangtuo.crm.domain.asAmount.to;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 单种券实体
 *
 * @author 木鸢
 * create by 2018-05-23 16:21
 */
public class CrmCouponTO implements Serializable{

    private static final long serialVersionUID = -6282702811724418820L;


    private Long id;

    /**
     * 优惠券标题
     */
    private String title;

    /**
     * 优惠券描述
     */
    private String description;

    /**
     * 优惠券金额(元)
     */
    private Long amount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
