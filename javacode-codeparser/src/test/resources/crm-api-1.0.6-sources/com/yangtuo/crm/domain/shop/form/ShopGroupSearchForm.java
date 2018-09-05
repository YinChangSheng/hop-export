package com.yangtuo.crm.domain.shop.form;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

/**
 * 门店分组查询
 *
 * @author 木鸢
 * @create by 2018-04-16 11:15
 */
public class ShopGroupSearchForm extends CrmBaseQuery {

    private static final long serialVersionUID = -7960688591636039807L;

    private String shopId;

    private String groupName;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
