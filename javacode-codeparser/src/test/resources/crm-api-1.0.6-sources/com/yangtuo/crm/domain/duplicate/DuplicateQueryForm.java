package com.yangtuo.crm.domain.duplicate;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/4/17.
 */
public class DuplicateQueryForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private String shopName;

    private String shopPhone;

    private String licenseName;

    private String licenseCode;

    private String userPhone;

    private String linkerPhone;

    private String linkerName;

    private Integer pageNo;

    private Integer pageSize;

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

    public String getLinkerName() {
        return linkerName;
    }

    public void setLinkerName(String linkerName) {
        this.linkerName = linkerName;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public String getLinkerPhone() {
        return linkerPhone;
    }

    public void setLinkerPhone(String linkerPhone) {
        this.linkerPhone = linkerPhone;
    }
}
