package com.yangtuo.crm.domain.shopServerLog;

import java.io.Serializable;

/**
 * 服务人员出入库记录
 */
public class ShopServerLogTO implements Serializable {

    /**
     * 出入库主键id
     */
    private Long id;
    /**
     * 门店ID
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 服务人员名字
     */
    private String userName;
    /**
     * 出入库类型
     */
    private String putTypeStr;
    /**
     * 出入库原因
     */
    private String putReason;
    /**
     * 出入库门店阶段
     */
    private String shopPutStageStr;
    /**
     * 部门名字
     */
    private String deptName;
    /**
     * 创建时间
     */
    private String createTimeStr;
    /**
     * 门店最后下单时间
     */
    private String lastOrderTime;
    /**
     * 最近有效拜访时间
     */
    private String lastContactTime;
    /**
     * 最近有效拜访内容
     */
    private String lastContactContent;
    /**
     * 是否是门店 用于页面跳转
     */
    private boolean isShop;

    public boolean isShop() {
        return isShop;
    }

    public void setShop(boolean shop) {
        isShop = shop;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPutTypeStr() {
        return putTypeStr;
    }

    public void setPutTypeStr(String putTypeStr) {
        this.putTypeStr = putTypeStr;
    }

    public String getPutReason() {
        return putReason;
    }

    public void setPutReason(String putReason) {
        this.putReason = putReason;
    }

    public String getShopPutStageStr() {
        return shopPutStageStr;
    }

    public void setShopPutStageStr(String shopPutStageStr) {
        this.shopPutStageStr = shopPutStageStr;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public String getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(String lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public String getLastContactTime() {
        return lastContactTime;
    }

    public void setLastContactTime(String lastContactTime) {
        this.lastContactTime = lastContactTime;
    }

    public String getLastContactContent() {
        return lastContactContent;
    }

    public void setLastContactContent(String lastContactContent) {
        this.lastContactContent = lastContactContent;
    }
}