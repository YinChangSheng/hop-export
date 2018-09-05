package com.yangtuo.crm.domain.shop.result;

/**
 * 门店业务模型
 *
 * @author 木鸢
 * create by2018-04-03 14:54
 */
public class CrmShopTo {

    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 1L;

    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 门店类型
     *
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.StoreTypeEnum
     */
    private Integer storeType;

    /**
     * 门店类型描述
     */
    private String storeTypeDesc;

    /**
     * 开通时间
     */
    private String openTime;

    /**
     * 区域
     */
    private String areaId;
    private String provinceId;
    private String cityId;
    private String areaDesc;
    private String provinceDesc;
    private String cityDesc;

    /**
     * 门店状态
     */
    private String shopStatus;
    /**
     * 门店状态描述
     */
    private String shopStatusDesc;

    /**
     * 店铺主联系人
     */
    private String shopLinker;

    /**
     * 地址
     */
    private String shopAddress;

    /**
     * 门店手机
     */
    private String shopPhone;

    /**
     * 创建时间
     **/
    private String createTime;

    /**
     * 所属门店
     */
    private String parentId;
    private String parentShopName;

    /**
     * 门店业务类型
     * BONDED_SHOP(0, "保税类"),
     * NORMAL_SHOP(1, "大贸类"),
     * SENIOR_SHOP(2, "全类型");
     *
     * @see1 com.yt.ustone.enums.ShopGradeEnums
     */
    private Integer shopGrade;
    private String  shopGradeDesc;

    /**
     * 门店活跃度
     *
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.ShopOrderFrequencyEnums
     */
    private Integer orderFrequency;

    private String orderFrequencyDesc;

    /**
     * 账号类型(连锁类型)
     *
     * @see1 1单体 2连锁
     */
    private Integer shopType;
    private String  shopTypeDesc;

    /**
     * 加盟类型
     *
     * @see1 com.yt.ustone.enums.ChainTypeEnum
     */
    private Integer chainType;

    /**
     * 门店成长体系等级
     *
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.ShopGrowingUpLevelEnums
     */
    private int    shopGrowingUpLevel;
    private String shopGrowingUpLevelName;

    /**
     * 门店等级分数
     */
    private Long shopLevel;

    /**
     * 纬度
     */
    private String latitude;
    /**
     * 经度
     */
    private String longitude;

    /**
     * 门店编号
     */
    private String shopNum;

    /**
     * 邮编
     */
    private Integer zipCode;

    /**
     * 门店来源 ApplyShopTypeEnum
     */
    private Integer applyShopType;

    private String applyShopTypeDesc;

    /**
     * 地图标注地址
     */
    private String mapAddress;

    /**
     * 资质审核状态(认证状态)
     *
     * @see1 com.yt.ustone.enums.ApproveStatusEnum
     */
    private Integer approveStatus;

    private String approveStatusDesc;

    /**
     * 备注
     */
    private String remark;

    private String createUser;

    private String editUser;

    public String getParentShopName() {
        return parentShopName;
    }

    public void setParentShopName(String parentShopName) {
        this.parentShopName = parentShopName;
    }

    public Integer getChainType() {
        return chainType;
    }

    public void setChainType(Integer chainType) {
        this.chainType = chainType;
    }

    public String getShopTypeDesc() {
        return shopTypeDesc;
    }

    public void setShopTypeDesc(String shopTypeDesc) {
        this.shopTypeDesc = shopTypeDesc;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getEditUser() {
        return editUser;
    }

    public void setEditUser(String editUser) {
        this.editUser = editUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public String getStoreTypeDesc() {
        return storeTypeDesc;
    }

    public void setStoreTypeDesc(String storeTypeDesc) {
        this.storeTypeDesc = storeTypeDesc;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
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

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getShopStatusDesc() {
        return shopStatusDesc;
    }

    public void setShopStatusDesc(String shopStatusDesc) {
        this.shopStatusDesc = shopStatusDesc;
    }

    public String getShopLinker() {
        return shopLinker;
    }

    public void setShopLinker(String shopLinker) {
        this.shopLinker = shopLinker;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getShopGrade() {
        return shopGrade;
    }

    public void setShopGrade(Integer shopGrade) {
        this.shopGrade = shopGrade;
    }

    public Integer getOrderFrequency() {
        return orderFrequency;
    }

    public void setOrderFrequency(Integer orderFrequency) {
        this.orderFrequency = orderFrequency;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public int getShopGrowingUpLevel() {
        return shopGrowingUpLevel;
    }

    public void setShopGrowingUpLevel(int shopGrowingUpLevel) {
        this.shopGrowingUpLevel = shopGrowingUpLevel;
    }

    public String getShopGrowingUpLevelName() {
        return shopGrowingUpLevelName;
    }

    public void setShopGrowingUpLevelName(String shopGrowingUpLevelName) {
        this.shopGrowingUpLevelName = shopGrowingUpLevelName;
    }

    public Long getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Long shopLevel) {
        this.shopLevel = shopLevel;
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

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getApplyShopType() {
        return applyShopType;
    }

    public void setApplyShopType(Integer applyShopType) {
        this.applyShopType = applyShopType;
    }

    public String getMapAddress() {
        return mapAddress;
    }

    public void setMapAddress(String mapAddress) {
        this.mapAddress = mapAddress;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getApproveStatusDesc() {
        return approveStatusDesc;
    }

    public String getApplyShopTypeDesc() {
        return applyShopTypeDesc;
    }

    public void setApplyShopTypeDesc(String applyShopTypeDesc) {
        this.applyShopTypeDesc = applyShopTypeDesc;
    }

    public String getOrderFrequencyDesc() {
        return orderFrequencyDesc;
    }

    public void setOrderFrequencyDesc(String orderFrequencyDesc) {
        this.orderFrequencyDesc = orderFrequencyDesc;
    }

    public void setApproveStatusDesc(String approveStatusDesc) {
        this.approveStatusDesc = approveStatusDesc;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
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

    public String getShopGradeDesc() {
        return shopGradeDesc;
    }

    public void setShopGradeDesc(String shopGradeDesc) {
        this.shopGradeDesc = shopGradeDesc;
    }

}
