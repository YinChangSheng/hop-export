package com.yangtuo.crm.domain.contact.query;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.util.List;

/**
 * @author 飞影
 * @create by 2018-04-10 15:17
 */
public class ContactPlanQuery extends CrmBaseQuery {

    private static final long serialVersionUID = 1390589870456520510L;

    /**
     * 跟进人id
     */
    private String            userId;

    private List<String>      userIds;
    /**
     * 门店名称
     */
    private String            shopName;
    /**
     * 业务id
     */
    private String            shopId;

    /**
     * 数据类型，1所有，2下属，3我的
     */
    private Integer           dataType;

    /**
     * 部门ID
     */
    private Long              deptId;
    /**
     * 开始时间
     */
    private String            startTime;
    /**
     * 结束时间 日期 0点
     */
    private String            endTime;
    /**
     * 状态 0 未联系 1 已联系
     */
    private Integer           status;
    /**
     * 门店id列表
     */
    private List<String>      shopIds;

    /**
     * 查询请求人ID
     */
    private String            queryCreator;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public List<String> getShopIds() {
        return shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public String getQueryCreator() {
        return queryCreator;
    }

    public void setQueryCreator(String queryCreator) {
        this.queryCreator = queryCreator;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }
}
