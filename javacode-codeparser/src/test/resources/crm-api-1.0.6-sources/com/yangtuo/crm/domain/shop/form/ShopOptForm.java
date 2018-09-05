package com.yangtuo.crm.domain.shop.form;

import com.yangtuo.crm.domain.shop.result.ShopQualificationTo;

import java.io.Serializable;
import java.util.List;

/**
 * 门店操作(新增/修改)
 *
 * @author 木鸢
 * create by2018-04-03 14:54
 */
public class ShopOptForm implements Serializable {

    private static final long serialVersionUID = -4575277225044952211L;

    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 区域
     */
    private String areaId;
    private String provinceId;
    private String cityId;

    /**
     * 地址
     */
    private String shopAddress;


    /**
     * 门店类型
     * @see1 com.yangtuo.crm.biz.shop.domain.enums.StoreTypeEnum
     */
    private Integer storeType;

    /**
     * 门店合作类型
     * BONDED_SHOP(0, "保税类"),
     * NORMAL_SHOP(1, "大贸类"),
     * SENIOR_SHOP(2, "全类型");
     * @see1 com.yt.ustone.enums.ShopGradeEnums
     */
    private Integer shopGrade;


    /**
     * 所属总店
     */
    private String parentId;

    /**
     * 联系人
     */
    private List<LinkerOptForm> linkers;

    /**
     * 资质信息
     */
    private ShopQualificationTo shopQualificationTo;

    /**
     * 备注
     * @return
     */
    private String remark;

    private String createUser;

    /**
     * 账号类型(连锁类型)
     *
     * @see1 1单体 2连锁
     */
    private Integer shopType;

    /**
     * 下述字段为程序补全form字段
     */
    /**
     * 门店来源 ApplyShopTypeEnum
     */
    private Integer applyShopType;


    /**
     * 资质审核状态(认证状态)
     * @see1 com.yt.ustone.enums.ApproveStatusEnum
     */
    private Integer approveStatus;

    /**
     * 门店状态
     */
    private String shopStatus;

    /**
     * 店铺主联系人
     */
    private String shopLinker;

    /**
     * 门店手机
     */
    private String shopPhone;

    /**
     * 门店编号
     */
    private String shopNum;

    /**
     * 账号类型非form提交(总店/分店)
     * @see1 com.yt.ustone.enums.ChainTypeEnum
     */
    private Integer chainType;

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public Integer getApplyShopType() {
        return applyShopType;
    }

    public void setApplyShopType(Integer applyShopType) {
        this.applyShopType = applyShopType;
    }

    public Integer getApproveStatus() {
        return approveStatus;
    }

    public void setApproveStatus(Integer approveStatus) {
        this.approveStatus = approveStatus;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
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

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
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

    public Integer getChainType() {
        return chainType;
    }

    public void setChainType(Integer chainType) {
        this.chainType = chainType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<LinkerOptForm> getLinkers() {
        return linkers;
    }

    public void setLinkers(List<LinkerOptForm> linkers) {
        this.linkers = linkers;
    }

    public ShopQualificationTo getShopQualificationTo() {
        return shopQualificationTo;
    }

    public void setShopQualificationTo(ShopQualificationTo shopQualificationTo) {
        this.shopQualificationTo = shopQualificationTo;
    }
}
