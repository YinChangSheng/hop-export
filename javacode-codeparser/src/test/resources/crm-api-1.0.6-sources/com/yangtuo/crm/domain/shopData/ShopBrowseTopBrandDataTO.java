package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/5/17.
 */
public class ShopBrowseTopBrandDataTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long brandId;

    private String brandName;

    private Integer browseTimes;

    private boolean isTopOrderBrand;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getBrowseTimes() {
        return browseTimes;
    }

    public void setBrowseTimes(Integer browseTimes) {
        this.browseTimes = browseTimes;
    }

    public boolean isTopOrderBrand() {
        return isTopOrderBrand;
    }

    public void setTopOrderBrand(boolean topOrderBrand) {
        isTopOrderBrand = topOrderBrand;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
}
