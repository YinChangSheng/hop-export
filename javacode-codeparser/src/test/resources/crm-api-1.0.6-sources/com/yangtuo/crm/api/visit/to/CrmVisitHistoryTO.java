package com.yangtuo.crm.api.visit.to;

import java.io.Serializable;
import java.util.List;

/**
 * Created by muyu on 2017/4/14.
 */
public class CrmVisitHistoryTO implements Serializable{
    private static final long serialVersionUID = -8088277159003689791L;
    private Long visitId;
    /**
     * 门店id
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 拜访类型
     */
    private Integer visitType;
    /**
     * 拜访类型
     */
    private String visitTypeStr;
    /**
     * 拜访时间
     */
    private String visitTimeStr;
    /**
     * 拜访目的
     */
    private String visitAims;
    /**
     * 拜访结果
     */
    private String visitResult;
    /**
     * 门店问题
     */
    private String shopProblem;
    /**
     * 解决方案
     */
    private String solution;
    /**
     * 其它
     */
    private String other;
    /**
     * 拜访角色
     */
    private String UserTypeSubdivideStr;

    /**
     * 销售姓名
     */
    private String afterUserRealName;
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
    /**
     * 门店地址
     */
    private String shopAddress;


    private List<CrmShopNeedsTO> crmShopNeedsTOs;

    /**
     * 门店距离
     * @return
     */
    private Long distance;

    /**
     * 门店图片
     * @return
     */
    private String picUrl;
    //图片展示域名
    private String picPath;

    /**
     * 经度
     */
    private String latitude;
    /**
     * 纬度
     */
    private String longitude;
    /**
     * 添加拜访记录时的地址
     */
    private String position;

    /**
     * 合作类型: 1 门店拜访 2 商机拜访
     */
    private Integer cooperateType;

    /**
     * 合作类型描述：1 门店拜访 2 商机拜访
     */
    private String cooperateTypeStr;

    /**
     * 是否已合作（1 已合作，0未合作）
     */
    private Integer isCooperate = 0;

    /**
     * 如果拜访记录对应的shop为未合作，则反查商机id，提供商机详情跳转（CRM3.0）
     */
    private Long applyShopId;

    /**
     * 拜访人姓名
     */
    private String visitName;

    /**
     * 拜访人号码
     */
    private String visitPhone;

    /**
     * 拜访方式,1为有效拜访，2为一般拜访
     */
    private Integer visitMode;

    /**
     * 拜访方式,1为有效拜访，2为一般拜访
     */
    private String visitModeStr;

    /**
     * 用户身份，用来代替userTypeSubdivideStr字段
     */
    private String userIdentity;

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public String getUserIdentity() {

        return userIdentity;
    }

    public Long getApplyShopId() {
        return applyShopId;
    }

    public void setApplyShopId(Long applyShopId) {
        this.applyShopId = applyShopId;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
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

    public Integer getVisitType() {
        return visitType;
    }

    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }

    public String getVisitTypeStr() {
        return visitTypeStr;
    }

    public void setVisitTypeStr(String visitTypeStr) {
        this.visitTypeStr = visitTypeStr;
    }

    public String getVisitTimeStr() {
        return visitTimeStr;
    }

    public void setVisitTimeStr(String visitTimeStr) {
        this.visitTimeStr = visitTimeStr;
    }

    public String getVisitAims() {
        return visitAims;
    }

    public void setVisitAims(String visitAims) {
        this.visitAims = visitAims;
    }

    public String getVisitResult() {
        return visitResult;
    }

    public void setVisitResult(String visitResult) {
        this.visitResult = visitResult;
    }

    public String getShopProblem() {
        return shopProblem;
    }

    public void setShopProblem(String shopProblem) {
        this.shopProblem = shopProblem;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getUserTypeSubdivideStr() {
        return UserTypeSubdivideStr;
    }

    public void setUserTypeSubdivideStr(String userTypeSubdivideStr) {
        UserTypeSubdivideStr = userTypeSubdivideStr;
    }

    public String getAfterUserRealName() {
        return afterUserRealName;
    }

    public void setAfterUserRealName(String afterUserRealName) {
        this.afterUserRealName = afterUserRealName;
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

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public List<CrmShopNeedsTO> getCrmShopNeedsTOs() {
        return crmShopNeedsTOs;
    }

    public void setCrmShopNeedsTOs(List<CrmShopNeedsTO> crmShopNeedsTOs) {
        this.crmShopNeedsTOs = crmShopNeedsTOs;
    }

    public Integer getCooperateType() {
        return cooperateType;
    }

    public void setCooperateType(Integer cooperateType) {
        this.cooperateType = cooperateType;
    }

    public String getCooperateTypeStr() {
        return cooperateTypeStr;
    }

    public void setCooperateTypeStr(String cooperateTypeStr) {
        this.cooperateTypeStr = cooperateTypeStr;
    }

    public Integer getIsCooperate() {
        return isCooperate;
    }

    public void setIsCooperate(Integer isCooperate) {
        this.isCooperate = isCooperate;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName;
    }

    public void setVisitPhone(String visitPhone) {
        this.visitPhone = visitPhone;
    }

    public void setVisitMode(Integer visitMode) {
        this.visitMode = visitMode;
    }

    public String getVisitName() {

        return visitName;
    }

    public String getVisitPhone() {
        return visitPhone;
    }

    public Integer getVisitMode() {
        return visitMode;
    }

    public void setVisitModeStr(String visitModeStr) {
        this.visitModeStr = visitModeStr;
    }

    public String getVisitModeStr() {

        return visitModeStr;
    }
}
