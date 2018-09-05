package com.yangtuo.crm.domain.shop.form;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.io.Serializable;

/**
 * 门店列表查询
 *
 * @author 木鸢
 * create by2018-04-03 14:54
 */
public class ShopQueryBaseForm extends CrmBaseQuery implements Serializable {

    private static final long serialVersionUID = 2958020601196545673L;

    /**
     * 门店名称
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 门店手机
     */
    private String shopPhone;

    private String provinceId;

    private String cityId;

    private String areaId;

    /**
     * 资质审核状态(认证状态)
     * @see1 com.yt.ustone.enums.ApproveStatusEnum
     */
    private Integer approveStatus;


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
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
}
