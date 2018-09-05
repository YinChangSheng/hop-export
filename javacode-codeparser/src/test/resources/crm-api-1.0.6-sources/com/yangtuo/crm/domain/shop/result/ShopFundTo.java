package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 门店资金、银行账号相关模型
 *
 * @author 木鸢
 * create by2018-04-03 15:56
 *
 * @deprecated
 */
public class ShopFundTo implements Serializable {

    private static final long serialVersionUID = -16912856574575015L;


    /**
     * 支付宝账号
     */
    private String shopAlipay;


    /**
     * 支付宝收款姓名
     */
    private String shopAlipayName;
    /**
     * 身份证号
     */
    private String identityCard;
    /**
     * 开户名称（公司信息）
     */
    private String shopCompany;
    /**
     * 开户银行
     */
    private String shopBank;
    /**
     * 银行账号
     */
    private String shopBankNum;

    /**
     * 门店资金
     */
    private Double shopMoney;

    /**
     * 财付通
     */
    private String shopTenpay;

    /**
     * 收款类型
     */
    private Integer collectType;
}
