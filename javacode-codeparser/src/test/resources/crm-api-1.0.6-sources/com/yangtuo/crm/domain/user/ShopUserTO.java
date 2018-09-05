package com.yangtuo.crm.domain.user;

import java.io.Serializable;

/**
 * 门店用户To
 *
 * @author 木鸢
 * @create by 2018-04-13 16:41
 */
public class ShopUserTO implements Serializable{

    private static final long serialVersionUID = -2604906505595008757L;


    // 用户id
    private String            id;

    // 用户
    private String            userNickName;

    // 真实姓名
    private String            userRealName;

    // 登录手机
    private String            loginPhone;

    //脱敏
    private String            loginPhoneDesen;

    // 用户类型
    private Integer           userType;


    // 用户子类型
    private Integer           userTypeSubdivide;

    // 所属门店id
    private String            shopId;

    private String            shopName;

    // 是否门店管理员
    private Integer           isManager;

    private Integer userStatus;

    private String createTime;

    private String editTime;

    private String           userTypeDesc;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getUserTypeDesc() {
        return userTypeDesc;
    }

    public void setUserTypeDesc(String userTypeDesc) {
        this.userTypeDesc = userTypeDesc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserTypeSubdivide() {
        return userTypeSubdivide;
    }

    public void setUserTypeSubdivide(Integer userTypeSubdivide) {
        this.userTypeSubdivide = userTypeSubdivide;
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

    public Integer getIsManager() {
        return isManager;
    }

    public void setIsManager(Integer isManager) {
        this.isManager = isManager;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getLoginPhoneDesen() {
        return loginPhoneDesen;
    }

    public void setLoginPhoneDesen(String loginPhoneDesen) {
        this.loginPhoneDesen = loginPhoneDesen;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getEditTime() {
        return editTime;
    }
}
