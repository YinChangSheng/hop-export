package com.yangtuo.crm.domain.contact.query;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.util.List;

/**
 * Created by muyu.myw on 2017/9/12.
 */
public class ContactRecordQuery extends CrmBaseQuery {

    private static final long serialVersionUID = -2667918474117005832L;

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
     * 开始时间
     */
    private String            startTime;
    /**
     * 结束时间 日期 0点
     */
    private String            endTime;
    /**
     * 状态 1 有效 2 无效
     */
    private Integer           type;

    /**
     * 部门ID
     */
    private Long              deptId;

    /**
     * 拜访方式，1上门，2远程
     */
    private Integer           visitMethod;

    /**
     * 省市区id ，冗余字段，方便查询
     */
    private String            provinceId;

    private String            cityId;

    private String            areaId;

    /**
     * 数据类型，1所有，2下属，3我的
     */
    private Integer           dataType;

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

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getQueryCreator() {
        return queryCreator;
    }

    public void setQueryCreator(String queryCreator) {
        this.queryCreator = queryCreator;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Integer getVisitMethod() {
        return visitMethod;
    }

    public void setVisitMethod(Integer visitMethod) {
        this.visitMethod = visitMethod;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }
}
