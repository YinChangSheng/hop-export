package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 门店资质信息模型
 *
 * @author 木鸢
 * create by2018-04-03 15:57
 */
public class ShopQualificationTo implements Serializable{

    private static final long serialVersionUID = -8706188112345156487L;

    /**
     * 门店id
     */
    private String shopId;
    /**
     * 门店营业执照名称
     */
    private String shopLicenseName;
    /**
     * 统一社会信用代码
     */
    private String shopLicenseCode;
    /**
     * 营业执照法人
     */
    private String shopLicensePerson;
    /**
     * 门店正面照片
     */
    private String shopPhotoFront;
    /**
     * 门店内部照片
     */
    private String shopPhotoBack;
    /**
     * 营业执照
     */
    private String businessLicense;
    /**
     * 身份证正面
     */
    private String cardFront;
    /**
     * 身份证反面
     */
    private String cardBack;

    /**
     * 食品安全证
     */
    private String foodLicense;

    /**
     * 资质审核状态
     */
    private Integer approveStatus;
    /**
     * 操作人类型：{1:专员，2:其他}
     */
    private Integer optUserType;

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopLicenseName() {
        return shopLicenseName;
    }

    public void setShopLicenseName(String shopLicenseName) {
        this.shopLicenseName = shopLicenseName;
    }

    public String getShopLicenseCode() {
        return shopLicenseCode;
    }

    public void setShopLicenseCode(String shopLicenseCode) {
        this.shopLicenseCode = shopLicenseCode;
    }

    public String getShopLicensePerson() {
        return shopLicensePerson;
    }

    public void setShopLicensePerson(String shopLicensePerson) {
        this.shopLicensePerson = shopLicensePerson;
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

    public Integer getOptUserType() {
        return optUserType;
    }

    public void setOptUserType(Integer optUserType) {
        this.optUserType = optUserType;
    }
}
