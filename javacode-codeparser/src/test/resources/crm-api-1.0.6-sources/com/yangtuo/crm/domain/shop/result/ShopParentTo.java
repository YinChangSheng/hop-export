package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 总店模型
 *
 * @author 木鸢
 * @create by 2018-05-04 11:37
 */
public class ShopParentTo implements Serializable{

    private String areaId;
    private String provinceId;
    private String cityId;
    private String areaDesc;
    private String provinceDesc;
    private String cityDesc;
    /**
     * 所属门店
     */
    private String parentId;
    private String parentShopName;

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentShopName() {
        return parentShopName;
    }

    public void setParentShopName(String parentShopName) {
        this.parentShopName = parentShopName;
    }
}
