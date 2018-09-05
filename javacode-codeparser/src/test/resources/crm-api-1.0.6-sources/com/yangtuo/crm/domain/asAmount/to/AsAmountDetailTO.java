package com.yangtuo.crm.domain.asAmount.to;

import java.io.Serializable;

/**
 * 账户余额明细
 *
 * @author 木鸢
 *         create by 2018-05-23 16:21
 */
public class AsAmountDetailTO implements Serializable {

    private static final long serialVersionUID = 7068204894975351850L;

    private Long id;

    /**
     * 场景
     */
    private Integer sceneType;
    private String sceneTypeStr;

    /**
     * 操作余额的账户类型
     */
    private Integer accountType;
    private String accountTypeStr;
    /**
     * 操作类型
     */
    private Integer operateType;
    private String operateTypeStr;

    /**
     * 变化金额
     */
    private Long disposeAmount;

    /**
     * 余额(元)
     */
    private Long amount;

    /**
     * 账户id
     */
    private String userId;

    private String userRealName;

    /**
     * 备注内容(json格式)
     */
    private AsAmountRemarkTO remarkTo;

    private String shopId;

    /**
     * 优惠券编号
     */
    private Long couponId;

    private String creator;

    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountTypeStr() {
        return accountTypeStr;
    }

    public void setAccountTypeStr(String accountTypeStr) {
        this.accountTypeStr = accountTypeStr;
    }

    public Integer getSceneType() {
        return sceneType;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public String getSceneTypeStr() {
        return sceneTypeStr;
    }

    public void setSceneTypeStr(String sceneTypeStr) {
        this.sceneTypeStr = sceneTypeStr;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getOperateTypeStr() {
        return operateTypeStr;
    }

    public void setOperateTypeStr(String operateTypeStr) {
        this.operateTypeStr = operateTypeStr;
    }

    public Long getDisposeAmount() {
        return disposeAmount;
    }

    public void setDisposeAmount(Long disposeAmount) {
        this.disposeAmount = disposeAmount;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public AsAmountRemarkTO getRemarkTo() {
        return remarkTo;
    }

    public void setRemarkTo(AsAmountRemarkTO remarkTo) {
        this.remarkTo = remarkTo;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
