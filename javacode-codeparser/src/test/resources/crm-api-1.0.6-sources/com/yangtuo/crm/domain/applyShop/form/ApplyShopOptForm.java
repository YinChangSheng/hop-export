package com.yangtuo.crm.domain.applyShop.form;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Created by diandian on 2018/4/11.
 */
public class ApplyShopOptForm implements Serializable{

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
     * 所属总店
     */
    private String            parentId;
    /**
     * 门店名称
     */
    String shopName;
    /**
     * 门店地址
     */
    String shopAddress;

    String provinceId;

    String cityId;

    String areaId;
    /**
     * 联系人
     */
    String shopLinker;
    /**
     * 联系电话
     */
    String shopPhone;
    /**
     * 店铺说明
     */
    String remark;
    /**
     * 来源类型
     */
    Integer type;
    /**
     * 门店合作状态
     */
    Integer status;

    /**
     * 邀请门店ID
     */
    String inviteShopId;

    /**
     * 邀请门店名称
     */
    String inviteShopName;

    /**
     * 最后联系时间
     */
    private String contactTime;

    /**
     * 联系内容
     */
    private String contactContent;


    //门店正面照片
    private String shopPhotoFront;
    //门店内部照片
    private String shopPhotoBack;
    //营业执照
    private String businessLicense;
    //身份证正面
    private String cardFront;
    //身份证反面
    private String cardBack;
    //食品经营许可证
    private String foodLicense;

    /**
     * 商机状态
     */
    Integer applyShopStatus;

    /**
     * 门店编号
     */
    private String            shopNum;

    /**
     * 门店管理员登录手机号
     */
    private String            loginPhone;

    /**
     * 成熟度
     */
    private String maturity;

    /**
     * 成熟度类型
     */
    private String maturityType;
    /**
     * 入库时间
     */
    private Date inputTime;

    private String inputTimeStr;
    /**
     * 门店类型（门店属性）
     */
    private Integer storeType;
    /**
     * 合作类型（门店属性）
     */
    private Integer shopGrade;
    /**
     * 账号类型（门店属性）
     */
    private Integer shopType;
    /**
     * 营业执照名称（门店属性）
     */
    private String shopLicenseName;
    /**
     * 联系人职位（门店属性）
     */
    private Integer linkerJob;
    /**
     * 联系人性别（门店属性）
     */
    private Integer linkerSex;
    /**
     * 联系人年龄（门店属性）
     */
    private Integer linkerAge;
    /**
     * 联系人微信（门店属性）
     */
    private String linkerWx;
    /**
     * 联系人邮箱（门店属性）
     */
    private String linkerEmail;
    /**
     * 最后联系人手机号
     */
    private String lastContactShopPhone;
    /**
     * 资质图片数量
     */
    private Integer photoCount;

    private String loginUser;

    private String afterServerId;

    public String getAfterServerId() {
        return afterServerId;
    }

    public void setAfterServerId(String afterServerId) {
        this.afterServerId = afterServerId;
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getContactTime() {
        return contactTime;
    }

    public void setContactTime(String contactTime) {
        this.contactTime = contactTime;
    }

    public String getContactContent() {
        return contactContent;
    }

    public void setContactContent(String contactContent) {
        this.contactContent = contactContent;
    }

    public String getShopPhotoFront() {
        return shopPhotoFront;
    }

    public void setShopPhotoFront(String shopPhotoFront) {
        this.shopPhotoFront = shopPhotoFront;
    }

    public String getShopPhotoBack() {
        return shopPhotoBack;
    }

    public void setShopPhotoBack(String shopPhotoBack) {
        this.shopPhotoBack = shopPhotoBack;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public String getCardFront() {
        return cardFront;
    }

    public void setCardFront(String cardFront) {
        this.cardFront = cardFront;
    }

    public String getCardBack() {
        return cardBack;
    }

    public void setCardBack(String cardBack) {
        this.cardBack = cardBack;
    }

    public String getFoodLicense() {
        return foodLicense;
    }

    public void setFoodLicense(String foodLicense) {
        this.foodLicense = foodLicense;
    }

    public Integer getApplyShopStatus() {
        return applyShopStatus;
    }

    public void setApplyShopStatus(Integer applyShopStatus) {
        this.applyShopStatus = applyShopStatus;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getLoginPhone() {
        return loginPhone;
    }

    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone;
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }

    public String getMaturityType() {
        return maturityType;
    }

    public void setMaturityType(String maturityType) {
        this.maturityType = maturityType;
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

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getShopLicenseName() {
        return shopLicenseName;
    }

    public void setShopLicenseName(String shopLicenseName) {
        this.shopLicenseName = shopLicenseName;
    }

    public Integer getLinkerJob() {
        return linkerJob;
    }

    public void setLinkerJob(Integer linkerJob) {
        this.linkerJob = linkerJob;
    }

    public Integer getLinkerSex() {
        return linkerSex;
    }

    public void setLinkerSex(Integer linkerSex) {
        this.linkerSex = linkerSex;
    }

    public Integer getLinkerAge() {
        return linkerAge;
    }

    public void setLinkerAge(Integer linkerAge) {
        this.linkerAge = linkerAge;
    }

    public String getLinkerWx() {
        return linkerWx;
    }

    public void setLinkerWx(String linkerWx) {
        this.linkerWx = linkerWx;
    }

    public String getLinkerEmail() {
        return linkerEmail;
    }

    public void setLinkerEmail(String linkerEmail) {
        this.linkerEmail = linkerEmail;
    }

    public String getLastContactShopPhone() {
        return lastContactShopPhone;
    }

    public void setLastContactShopPhone(String lastContactShopPhone) {
        this.lastContactShopPhone = lastContactShopPhone;
    }

    public Integer getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
}
