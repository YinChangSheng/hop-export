package com.yangtuo.crm.domain.task;

import java.io.Serializable;

/**
 * 服务人员代办任务 TO
 *
 * @migration com.hipac.biz.taskCenter.domain.vo.CrmTaskVO
 * @author 景天
 * @create 2018-01-26 上午 10:04
 */
public class TaskCenterTO implements Serializable{

    private static final long serialVersionUID = -4206841561995688010L;

    private Long id;
    /**
     * 门店id
     */
    private String  shopId;
    /**
     * 门店名称
     */
    private String  shopName;
    /**
     * 门店联系人
     */
    private String  shopLinker;
    /**
     * 门店联系人电话
     */
    private String  shopPhone;
    /**
     * 代办人id
     */
    private String  dealUser;

    private String  dealUserName;
    /**
     * 任务状态(1,待处理 2,处理中 3,已处理)
     */
    private Integer taskStatus;
    /**
     * 任务标题
     */
    private String  taskName;
    /**
     * 异常情况
     */
    private String  exceptCondition;
    /**
     * 订单编号
     */
    private String  orderNum;
    /**
     * 任务内容显示
     */
    private String  taskInfo;
    /**
     * 处理内容描述
     */
    private String  taskDesc;
    /**
     * 任务类型描述
     */
    private String  taskTypeDesc;
    /**
     * 任务状态描述
     */
    private String  taskStatusDesc;
    /**
     * 业务类型
     */
    private Integer bizType;
    /**
     * 业务子类型
     */
    private Integer bizSubType;
    /**
     * 任务创建时间
     */
    private String  createTime;
    /**
     * 修改时间
     */
    private String  editTime;

    private boolean isApplyShop;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 异常物流耗时（小时）
     */
    private long timeConsuming = 0;

    public long getTimeConsuming() {
        return timeConsuming;
    }

    public void setTimeConsuming(long timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isApplyShop() {
        return isApplyShop;
    }

    public void setApplyShop(boolean applyShop) {
        isApplyShop = applyShop;
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

    public String getShopLinker() {
        return shopLinker;
    }

    public void setShopLinker(String shopLinker) {
        this.shopLinker = shopLinker;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getDealUser() {
        return dealUser;
    }

    public void setDealUser(String dealUser) {
        this.dealUser = dealUser;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getExceptCondition() {
        return exceptCondition;
    }

    public void setExceptCondition(String exceptCondition) {
        this.exceptCondition = exceptCondition;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getTaskInfo() {
        return taskInfo;
    }

    public void setTaskInfo(String taskInfo) {
        this.taskInfo = taskInfo;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getTaskTypeDesc() {
        return taskTypeDesc;
    }

    public void setTaskTypeDesc(String taskTypeDesc) {
        this.taskTypeDesc = taskTypeDesc;
    }

    public String getTaskStatusDesc() {
        return taskStatusDesc;
    }

    public void setTaskStatusDesc(String taskStatusDesc) {
        this.taskStatusDesc = taskStatusDesc;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public Integer getBizSubType() {
        return bizSubType;
    }

    public void setBizSubType(Integer bizSubType) {
        this.bizSubType = bizSubType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getDealUserName() {
        return dealUserName;
    }

    public void setDealUserName(String dealUserName) {
        this.dealUserName = dealUserName;
    }
}
