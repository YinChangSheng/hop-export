package com.yangtuo.crm.domain.asAmount.form;

import com.yangtuo.crm.domain.asAmount.to.AsAmountRemarkTO;

import java.io.Serializable;

/**
 * 服务人员发券操作form
 *
 * @author 木鸢
 * @create by 2018-05-23 10:51
 */
public class AsAmountOptForm implements Serializable {

    private static final long serialVersionUID = -8952975591561838365L;

    private Long accountId;

    private String userId;
    /**
     * @See com.yangtuo.crm.biz.afterServerAmount.domain.enums.AsAccountTypeEnum
     */
    private Integer accountType;

    /**
     * com.yangtuo.crm.domain.asAmount.enums.AsAccountOptTypeEnum
     */
    private Integer optType;

    /**
     * com.yangtuo.crm.domain.asAmount.enums.AsAccountSceneEnum
     */
    private Integer sceneType;

    /**
     * 变化金额(分)
     */
    private Long disposeAmount;

    private AsAmountRemarkTO remark;

    private String shopId;

    private Long couponId;

    private String operator;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public Integer getSceneType() {
        return sceneType;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public Long getDisposeAmount() {
        return disposeAmount;
    }

    public void setDisposeAmount(Long disposeAmount) {
        this.disposeAmount = disposeAmount;
    }

    public AsAmountRemarkTO getRemark() {
        return remark;
    }

    public void setRemark(AsAmountRemarkTO remark) {
        this.remark = remark;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
