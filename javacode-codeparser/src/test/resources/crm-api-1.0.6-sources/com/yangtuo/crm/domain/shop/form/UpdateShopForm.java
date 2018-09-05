package com.yangtuo.crm.domain.shop.form;

/**
 * 修改门店操作门店
 *
 * @author 木鸢
 * @create by 2018-04-18 11:47
 */
public class UpdateShopForm extends ShopOptForm{

    private static final long serialVersionUID = -47582123208717742L;

    public static final int applyShop = 1;
    public static final int shop = 2;
    public static final int toCollaborate = 3;

    private Integer optType = 2;

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }
}
