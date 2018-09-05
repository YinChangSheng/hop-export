package com.yangtuo.crm.api.visit.query;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by muyu on 2017/4/14.
 */
public class CrmVisitHistoryQuery implements Serializable {
    private static final long serialVersionUID = 4712825231895898201L;

    private Long id;
    /**
     * 门店名称
     */
    private String shopId;
    /**
     * 门店所在省id
     */
    private String shopProId;
    /**
     * 门店所在城市id
     */
    private String shopCityId;
    /**
     *门店所在区i
     */
    private String shopAreaId;
    /**
     * 拜访类型
     */
    private Integer visitType;
    /**
     * 拜访开始时间
     */
    private Date visitTimeStart;
    /**
     * 拜访结束时间
     */
    private Date visitTimeEnd;
    /**
     * 需求类型
     */
    private Integer needsType;

    /**
     * 销售ID列表
     */
    private List<String> afterServerIdList;

    private String afterServerId;

    /**
     * 销售类型
     */
    private Integer userTypeSubdivide;


    /**
     * 是否已解决
     */
    private Integer mark;

    private Integer needsStatus;

    /**
     * 省份集合
     */
    private List<String> provinceAreas;


    /**
     * 需求创建人
     */
    private String needCreator;

    /**
     * 店铺是否是合作状态字段
     * 添加人：阿健 添加时间: 16/12/28
     */
    private Integer shopInUse;

    /**
     * 合作类型: 1 门店拜访 2 商机拜访
     */
    private Integer cooperateType;

    /**
     * <p>拜访方式：1为有效拜访，2为一般拜访 3 远程拜访</p>
     * <p><b>备注：兼容老版本，只能单选</b></p>
     */
    private Integer visitMode;

    /**
     * <p>拜访方式：1为有效拜访，2为一般拜访 3 远程拜访</p>
     * <p><b>备注：支持多选</b></p>
     */
    private String visitModes;

    Integer pageNo = 1;

    Integer pageSize = 10;


    public Integer getShopInUse() {
        return shopInUse;
    }

    public void setShopInUse(Integer shopInUse) {
        this.shopInUse = shopInUse;
    }

    public void setAfterServerIdList(List<String> afterServerIdList) {
        this.afterServerIdList = afterServerIdList;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getNeedsType() {
        return needsType;
    }

    public void setNeedsType(Integer needsType) {
        this.needsType = needsType;
    }

    public String getShopAreaId() {
        return shopAreaId;
    }

    public void setShopAreaId(String shopAreaId) {
        this.shopAreaId = shopAreaId;
    }

    public String getShopCityId() {
        return shopCityId;
    }

    public void setShopCityId(String shopCityId) {
        this.shopCityId = shopCityId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopProId() {
        return shopProId;
    }

    public void setShopProId(String shopProId) {
        this.shopProId = shopProId;
    }

    public Integer getUserTypeSubdivide() {
        return userTypeSubdivide;
    }

    public void setUserTypeSubdivide(Integer userTypeSubdivide) {
        this.userTypeSubdivide = userTypeSubdivide;
    }

    public Date getVisitTimeEnd() {
        return visitTimeEnd;
    }

    public void setVisitTimeEnd(Date visitTimeEnd) {
        this.visitTimeEnd = visitTimeEnd;
    }

    public Date getVisitTimeStart() {
        return visitTimeStart;
    }

    public void setVisitTimeStart(Date visitTimeStart) {
        this.visitTimeStart = visitTimeStart;
    }

    public Integer getVisitType() {
        return visitType;
    }

    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }

    public String getAfterServerId() {
        return afterServerId;
    }

    public void setAfterServerId(String afterServerId) {
        this.afterServerId = afterServerId;
    }

    public Integer getNeedsStatus() {
        return needsStatus;
    }

    public void setNeedsStatus(Integer needsStatus) {
        this.needsStatus = needsStatus;
    }

    public List<String> getProvinceAreas() {
        return provinceAreas;
    }

    public void setProvinceAreas(List<String> provinceAreas) {
        this.provinceAreas = provinceAreas;
    }

    public String getNeedCreator() {
        return needCreator;
    }

    public void setNeedCreator(String needCreator) {
        this.needCreator = needCreator;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<String> getAfterServerIdList() {
        return afterServerIdList;
    }

    public Integer getCooperateType() {
        return cooperateType;
    }

    public void setCooperateType(Integer cooperateType) {
        this.cooperateType = cooperateType;
    }

    public void setVisitMode(Integer visitMode) {
        this.visitMode = visitMode;
    }

    public Integer getVisitMode() {
        return visitMode;
    }

    public String getVisitModes() {
        return visitModes;
    }

    public void setVisitModes(String visitModes) {
        this.visitModes = visitModes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
