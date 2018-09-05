package com.yangtuo.crm.domain.applyShop.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Created by diandian on 2018/4/11.
 */
public class ApplyShopTO implements Serializable{

    private static final long serialVersionUID = 8799529644711474557L;
    /**
     * 申请入驻ID
     */
    Long id;
    /**
     * 门店ID
     */
    String shopId;
    /**
     * 门店名称
     */
    String shopName;
    /**
     * 门店地址
     */
    String shopAddress;
    /**
     * 联系人
     */
    String shopLinker;
    /**
     * 联系电话
     */
    String shopPhone;
    /**
     * 0 未指派服务人员 1 已指派服务人员
     */
    Integer assigned;
    /**
     * 服务人员真实姓名
     */
    String afterServerName;

    /**
     * 来源类型
     */
    Integer type;
    /**
     * 来源类型描述
     */
    String typeStr;
    /**
     * 门店合作状态
     */
    Integer status;
    /**
     * 状态说明
     */
    String statusStr;
    /**
     * 最后联系时间
     */
    private String lastContactTime;

    /**
     * 联系内容
     */
    private String contactContent;

    /**
     * 商机状态
     */
    Integer applyShopStatus;

    String applyShopStatusStr;
    /**
     * 门店编号
     */
    private String            shopNum;

    /**
     * 成熟度
     */
    private String maturity;
    /**
     * 入库时间
     */
    private Date inputTime;

    private String inputTimeStr;
    /**
     * 账号类型（门店属性）
     */
    private Integer shopType;
    /**
     * 最后联系人手机号
     */
    private String lastContactShopPhone;

    private String lastLinkerId;

    private Date createTime;

    private String createTimeStr;

    private String afterServer;

    private String provinceId;

    private String cityId;

    private String areaId;

    private String provinceDesc;

    private String cityDesc;

    private String areaDesc;

    /**
     * 门店类型
     */
    private Integer storeType;

    private String storeTypeDesc;

    /**
     * 合作类型 （全类型，大贸类型）
     */
    private Integer shopGrade;
    /**
     * 所属总店
     */
    private String parentId;

    private String parentShopName;

    private String parentProvinceId;

    private String parentCityId;

    private String parentAreaId;

    private String parentProvinceDesc;

    private String parentCityDesc;

    private String parentAreaDesc;

    private String inviteShopId;

    private String inviteShopName;

    private String shopGradeDesc;

    private String creator;

    private String creatorName;

    private String remark;

    private String maturityType;

    public String getMaturityType() {
        return maturityType;
    }

    public void setMaturityType(String maturityType) {
        this.maturityType = maturityType;
    }

    public String getLastLinkerId() {
        return lastLinkerId;
    }

    public void setLastLinkerId(String lastLinkerId) {
        this.lastLinkerId = lastLinkerId;
    }

    public String getParentProvinceId() {
        return parentProvinceId;
    }

    public void setParentProvinceId(String parentProvinceId) {
        this.parentProvinceId = parentProvinceId;
    }

    public String getParentCityId() {
        return parentCityId;
    }

    public void setParentCityId(String parentCityId) {
        this.parentCityId = parentCityId;
    }

    public String getParentAreaId() {
        return parentAreaId;
    }

    public void setParentAreaId(String parentAreaId) {
        this.parentAreaId = parentAreaId;
    }

    public String getParentProvinceDesc() {
        return parentProvinceDesc;
    }

    public void setParentProvinceDesc(String parentProvinceDesc) {
        this.parentProvinceDesc = parentProvinceDesc;
    }

    public String getParentCityDesc() {
        return parentCityDesc;
    }

    public void setParentCityDesc(String parentCityDesc) {
        this.parentCityDesc = parentCityDesc;
    }

    public String getParentAreaDesc() {
        return parentAreaDesc;
    }

    public void setParentAreaDesc(String parentAreaDesc) {
        this.parentAreaDesc = parentAreaDesc;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getShopGradeDesc() {
        return shopGradeDesc;
    }

    public void setShopGradeDesc(String shopGradeDesc) {
        this.shopGradeDesc = shopGradeDesc;
    }

    public String getStoreTypeDesc() {
        return storeTypeDesc;
    }

    public void setStoreTypeDesc(String storeTypeDesc) {
        this.storeTypeDesc = storeTypeDesc;
    }

    public String getInviteShopId() {
        return inviteShopId;
    }

    public void setInviteShopId(String inviteShopId) {
        this.inviteShopId = inviteShopId;
    }

    public String getInviteShopName() {
        return inviteShopName;
    }

    public void setInviteShopName(String inviteShopName) {
        this.inviteShopName = inviteShopName;
    }

    public String getParentShopName() {
        return parentShopName;
    }

    public void setParentShopName(String parentShopName) {
        this.parentShopName = parentShopName;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public Integer getShopGrade() {
        return shopGrade;
    }

    public void setShopGrade(Integer shopGrade) {
        this.shopGrade = shopGrade;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getProvinceDesc() {
        return provinceDesc;
    }

    public void setProvinceDesc(String provinceDesc) {
        this.provinceDesc = provinceDesc;
    }

    public String getCityDesc() {
        return cityDesc;
    }

    public void setCityDesc(String cityDesc) {
        this.cityDesc = cityDesc;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    public String getAfterServer() {
        return afterServer;
    }

    public void setAfterServer(String afterServer) {
        this.afterServer = afterServer;
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

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
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

    public Integer getAssigned() {
        return assigned;
    }

    public void setAssigned(Integer assigned) {
        this.assigned = assigned;
    }

    public String getAfterServerName() {
        return afterServerName;
    }

    public void setAfterServerName(String afterServerName) {
        this.afterServerName = afterServerName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr() {
        return statusStr;
    }

    public void setStatusStr(String statusStr) {
        this.statusStr = statusStr;
    }

    public String getLastContactTime() {
        return lastContactTime;
    }

    public void setLastContactTime(String lastContactTime) {
        this.lastContactTime = lastContactTime;
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent;
    }

    public Integer getApplyShopStatus() {
        return applyShopStatus;
    }

    public void setApplyShopStatus(Integer applyShopStatus) {
        this.applyShopStatus = applyShopStatus;
    }

    public String getApplyShopStatusStr() {
        return applyShopStatusStr;
    }

    public void setApplyShopStatusStr(String applyShopStatusStr) {
        this.applyShopStatusStr = applyShopStatusStr;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }

    public Date getInputTime() {
        return inputTime;
    }

    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    public String getInputTimeStr() {
        return inputTimeStr;
    }

    public void setInputTimeStr(String inputTimeStr) {
        this.inputTimeStr = inputTimeStr;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getLastContactShopPhone() {
        return lastContactShopPhone;
    }

    public void setLastContactShopPhone(String lastContactShopPhone) {
        this.lastContactShopPhone = lastContactShopPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }
}
