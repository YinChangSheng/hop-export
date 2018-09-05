package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 门店前台模型
 *
 * @author 木鸢
 * create by2018-04-03 16:04
 */
public class ShopSellTo implements Serializable{

    private static final long serialVersionUID = -20566107836717543L;

    /**
     * 是否微小店
     */
    private Boolean isWxShop;
   /* *//**
     * 是否显示限时购
     *//*
    private Integer isShowTimelimit;
    *//**
     * 是否在限购白名单
     *//*
    private boolean isRestrict;
    *//**
     * 分店分成比例
     *//*
    private Integer sharingPercent;
    *//**
     * 分销比例百分比,存整数
     *//*
    private Integer distributorPercent;

    *//**
     * 店员分销比例
     *//*
    private Integer shopEEPercent;

    *//**
     * 公众号二维码
     *//*
    private String qrCodePicPath;

    *//**
     * 二维码
     *//*
    private String qrCodePath;

    *//**
     * 店铺头像
     *//*
    private String shopFacePic;

    *//**
     * 店铺宣传语
     *//*
    private String shopNotice;

    *//**
     * 店铺装修信息,扩展字段
     *//*
    private String shopDecoration;

    *//**
     * 是否海拍客认证
     *//*
    private Integer isHipacCertification;

    *//**
     * 自提类型
     *//*
    private Integer tpShopDeliveryAddressType;

    *//**
     * 收件人
     *//*
    private String addressee;

    *//**
     * 协议签署人
     *//*
    private String agreeUser;*/

    public Boolean getWxShop() {
        return isWxShop;
    }

    public void setWxShop(Boolean wxShop) {
        isWxShop = wxShop;
    }
}
