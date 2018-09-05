package com.yangtuo.crm.domain.shop.form;

import java.util.Date;

/**
 * 添加门店
 *
 * @author 木鸢
 * @create by 2018-04-18 11:47
 */
public class AddShopForm  extends ShopOptForm{
    private Date  openTime;

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }
}
