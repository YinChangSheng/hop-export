package com.yangtuo.crm.domain.shop.form;

import java.io.Serializable;
import java.util.Date;

/**
 * 门店列表查询
 *
 * @author 木鸢
 * create by2018-04-03 14:54
 */
public class ShopQueryForm extends ShopQueryBaseForm implements Serializable {


    private static final long serialVersionUID = 6868127025323638656L;

    /**
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.SearchTypeEnum
     */
    private int searchType;

    /**
     * 当前登录用户
     */
    private String loginUserId;

    /**
     * 服务人员
     */
    private String afterServer;

    /**
     * 起始开通时间
     */
    private Date openTimeStart;

    /**
     * 终止开通时间
     */
    private Date openTimeEnd;

    /**
     * 起止最后拜访时间
     */
    private Date lastContactTimeStart;
    private Date lastContactTimeEnd;

    /**
     * 起止最后下单时间
     */
    private Date lastOrderTimeStart;
    private Date lastOrderTimeEnd;

    /**
     * 起止最后访问时间
     */
    private Date lastVisitTimeStart;
    private Date lastVisitTimeEnd;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 联系人姓名
     */
    private String linkerName;

    /**
     * 门店等级
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.ShopGrowingUpLevelEnums
     */
    private Integer shopGrowingUpLevel;

    /**
     * 门店活跃度
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.ShopOrderFrequencyEnums
     */
    private Integer orderFrequency;

    /**
     * 合作业务类型
     */
    private Integer shopGrade;

    /**
     * 门店类型
     */
    private Integer storeType;

    /**
     * 账号类型(单体1、连锁总店2、连锁分店3)
     */
    private Integer shopType;

    /**
     * 是否冻结 1是
     */
    private Integer isFrozen;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序类型
     */
    private String sortType;

    /**
     * 门店来源
     */
    private Integer applyShopType;

    /**
     * 最近登录时间 开始时间
     */
    private Date lastLoginTimeStart;
    /**
     * 最近登录时间 截至时间
     */
    private Date lastLoginTimeEnd;

    public Date getLastLoginTimeStart() {
        return lastLoginTimeStart;
    }

    public void setLastLoginTimeStart(Date lastLoginTimeStart) {
        this.lastLoginTimeStart = lastLoginTimeStart;
    }

    public Date getLastLoginTimeEnd() {
        return lastLoginTimeEnd;
    }

    public void setLastLoginTimeEnd(Date lastLoginTimeEnd) {
        this.lastLoginTimeEnd = lastLoginTimeEnd;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public Integer getShopGrade() {
        return shopGrade;
    }

    public void setShopGrade(Integer shopGrade) {
        this.shopGrade = shopGrade;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public String getLinkerName() {
        return linkerName;
    }

    public void setLinkerName(String linkerName) {
        this.linkerName = linkerName;
    }

    public int getSearchType() {
        return searchType;
    }

    public void setSearchType(int searchType) {
        this.searchType = searchType;
    }

    public String getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId;
    }

    public String getAfterServer() {
        return afterServer;
    }

    public void setAfterServer(String afterServer) {
        this.afterServer = afterServer;
    }

    public Integer getShopGrowingUpLevel() {
        return shopGrowingUpLevel;
    }

    public void setShopGrowingUpLevel(Integer shopGrowingUpLevel) {
        this.shopGrowingUpLevel = shopGrowingUpLevel;
    }

    public Integer getOrderFrequency() {
        return orderFrequency;
    }

    public void setOrderFrequency(Integer orderFrequency) {
        this.orderFrequency = orderFrequency;
    }

    public Date getOpenTimeStart() {
        return openTimeStart;
    }

    public void setOpenTimeStart(Date openTimeStart) {
        this.openTimeStart = openTimeStart;
    }

    public Date getOpenTimeEnd() {
        return openTimeEnd;
    }

    public void setOpenTimeEnd(Date openTimeEnd) {
        this.openTimeEnd = openTimeEnd;
    }

    public Date getLastContactTimeStart() {
        return lastContactTimeStart;
    }

    public void setLastContactTimeStart(Date lastContactTimeStart) {
        this.lastContactTimeStart = lastContactTimeStart;
    }

    public Date getLastContactTimeEnd() {
        return lastContactTimeEnd;
    }

    public void setLastContactTimeEnd(Date lastContactTimeEnd) {
        this.lastContactTimeEnd = lastContactTimeEnd;
    }

    public Date getLastOrderTimeStart() {
        return lastOrderTimeStart;
    }

    public void setLastOrderTimeStart(Date lastOrderTimeStart) {
        this.lastOrderTimeStart = lastOrderTimeStart;
    }

    public Date getLastOrderTimeEnd() {
        return lastOrderTimeEnd;
    }

    public void setLastOrderTimeEnd(Date lastOrderTimeEnd) {
        this.lastOrderTimeEnd = lastOrderTimeEnd;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Date getLastVisitTimeStart() {
        return lastVisitTimeStart;
    }

    public void setLastVisitTimeStart(Date lastVisitTimeStart) {
        this.lastVisitTimeStart = lastVisitTimeStart;
    }

    public Date getLastVisitTimeEnd() {
        return lastVisitTimeEnd;
    }

    public void setLastVisitTimeEnd(Date lastVisitTimeEnd) {
        this.lastVisitTimeEnd = lastVisitTimeEnd;
    }

    public Integer getApplyShopType() {
        return applyShopType;
    }

    public void setApplyShopType(Integer applyShopType) {
        this.applyShopType = applyShopType;
    }
}
