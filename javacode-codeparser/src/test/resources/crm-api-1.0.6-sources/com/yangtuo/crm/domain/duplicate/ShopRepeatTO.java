package com.yangtuo.crm.domain.duplicate;

import com.yangtuo.crm.domain.shop.result.ShopServerTo;

import java.util.List;

/**
 * @author Created by diandian on 2018/4/12.
 */
public class ShopRepeatTO {

    private String shopId;

    private String shopName;

    private String shopAddress;

    /**
     * 门店阶段：商机门店，有效门店
     */
    private String shopStage;

    private Boolean isShop;

    /**
     * 如果是门店 则是list
     */
    private List<ShopServerTo> afterServers;

    /**
     *
     * 如果是商机则是单个服务人员
     */
    private String afterServer;

    private Integer chainType;

    private String shopLinker;

    private String shopPhone;

    private String createTime;

    private String applyShopId;

    private String storeType;

    private String shopType;

    private String openTime;

    private String provinceStr;

    private String cityStr;

    private String areaStr;

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getAreaStr() {
        return areaStr;
    }

    public void setAreaStr(String areaStr) {
        this.areaStr = areaStr;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getProvinceStr() {
        return provinceStr;
    }

    public void setProvinceStr(String provinceStr) {
        this.provinceStr = provinceStr;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Boolean getShop() {
        return isShop;
    }

    public void setShop(Boolean shop) {
        isShop = shop;
    }

    public String getApplyShopId() {
        return applyShopId;
    }

    public void setApplyShopId(String applyShopId) {
        this.applyShopId = applyShopId;
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

    public String getShopStage() {
        return shopStage;
    }

    public void setShopStage(String shopStage) {
        this.shopStage = shopStage;
    }

    public List<ShopServerTo> getAfterServers() {
        return afterServers;
    }

    public void setAfterServers(List<ShopServerTo> afterServers) {
        this.afterServers = afterServers;
    }

    public Integer getChainType() {
        return chainType;
    }

    public void setChainType(Integer chainType) {
        this.chainType = chainType;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAfterServer() {
        return afterServer;
    }

    public void setAfterServer(String afterServer) {
        this.afterServer = afterServer;
    }
}
