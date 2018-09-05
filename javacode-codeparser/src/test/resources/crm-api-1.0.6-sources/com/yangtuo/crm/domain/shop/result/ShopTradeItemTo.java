package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;
import java.util.List;

/**
 * 门店交易具体模型
 *
 * @author 木鸢
 * create by2018-04-10 16:20
 */
public class ShopTradeItemTo implements Serializable{

    private static final long serialVersionUID = -6283766709342357709L;

    //近30天TOP下单品牌
    List<ShopBrandDataTO>orderBrandList;

    //近30天TOP浏览品牌,待定义

    //近30天TOP下单商品,待定义

    //近30天TOP下单类目,待定义


    public List<ShopBrandDataTO> getOrderBrandList() {
        return orderBrandList;
    }

    public void setOrderBrandList(List<ShopBrandDataTO> orderBrandList) {
        this.orderBrandList = orderBrandList;
    }
}
