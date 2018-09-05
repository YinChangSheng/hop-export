package com.yangtuo.crm.api.visit.to;

import java.io.Serializable;

/**
 * Created by muyu on 2017/4/14.
 */
public class CrmShopNeedsTO implements Serializable{

    private static final long serialVersionUID = -605757087942509038L;
    private Long id;
    /**
     * 门店id
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 是否解决
     */
    private Integer mark;
    /**
     * 门店需求
     */
    private String needs;
    /**
     * 需求类型
     */
    private Integer needsType;
    /**
     * 需求类型
     */
    private String needsTypeStr;

    /**
     * 拜访角色
     */
    private String UserTypeSubdivideStr;

    /**
     * 销售姓名
     */
    private String afterServerName;
    /**
     * 门店所属省id
     */
    private String shopProId;

    /**
     * 门店所属省名称
     */
    private String shopProName;

    /**
     * 门店所属市id
     */
    private String shopCityId;

    /**
     * 门店所属市名称
     */
    private String shopCityName;

    /**
     * 门店所属地区id
     */
    private String shopAreaId;

    /**
     * 门店所属地区名称
     */
    private String shopAreaName;

    private Long visitId;

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

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getNeeds() {
        return needs;
    }

    public void setNeeds(String needs) {
        this.needs = needs;
    }

    public Integer getNeedsType() {
        return needsType;
    }

    public void setNeedsType(Integer needsType) {
        this.needsType = needsType;
    }

    public String getNeedsTypeStr() {
        return needsTypeStr;
    }

    public void setNeedsTypeStr(String needsTypeStr) {
        this.needsTypeStr = needsTypeStr;
    }

    public String getUserTypeSubdivideStr() {
        return UserTypeSubdivideStr;
    }

    public void setUserTypeSubdivideStr(String userTypeSubdivideStr) {
        UserTypeSubdivideStr = userTypeSubdivideStr;
    }

    public String getAfterServerName() {
        return afterServerName;
    }

    public void setAfterServerName(String afterServerName) {
        this.afterServerName = afterServerName;
    }

    public String getShopProId() {
        return shopProId;
    }

    public void setShopProId(String shopProId) {
        this.shopProId = shopProId;
    }

    public String getShopProName() {
        return shopProName;
    }

    public void setShopProName(String shopProName) {
        this.shopProName = shopProName;
    }

    public String getShopCityId() {
        return shopCityId;
    }

    public void setShopCityId(String shopCityId) {
        this.shopCityId = shopCityId;
    }

    public String getShopCityName() {
        return shopCityName;
    }

    public void setShopCityName(String shopCityName) {
        this.shopCityName = shopCityName;
    }

    public String getShopAreaId() {
        return shopAreaId;
    }

    public void setShopAreaId(String shopAreaId) {
        this.shopAreaId = shopAreaId;
    }

    public String getShopAreaName() {
        return shopAreaName;
    }

    public void setShopAreaName(String shopAreaName) {
        this.shopAreaName = shopAreaName;
    }

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }
}
