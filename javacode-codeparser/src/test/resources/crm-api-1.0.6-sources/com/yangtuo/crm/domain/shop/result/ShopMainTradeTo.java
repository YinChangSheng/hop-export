package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 门店交易汇总模型
 *
 * @author 木鸢
 * create by2018-04-03 16:20
 */
public class ShopMainTradeTo implements Serializable{
    private static final long serialVersionUID = -4926422884680474181L;
    /**
     * 本月门店分数
     */
    private Double shopScoreCurMonth;
    /**
     * 上月门店分数
     */
    private Double shopScoreLastMonth;

    /**
     * 最近访问时间
     */
    private String lastVisitTime;
    /**
     * 最近下单时间
     */
    private String lastOrderTime;


    /** 本月下单金额 **/
    private long thisMonthOrderAmt;

    /** 本月大贸下单金额 **/
    private long thisMonthDmOrderAmt;

    /** 本月跨境（海淘）下单金额 **/
    private long thisMonthHtOrderAmt;

    /** 本月下单商品类目数量 **/
    private long thisMonthOrderItemCateNum;

    /** 本月下单SKU数量 **/
    private long thisMonthOrderSkuNum;

    /** 本月下单天数 **/
    private long thisMonthOrderDaysNum;

    /** 本月订单数量 **/
    private long thisMonthOrderNum;

    /** 上月下单金额 **/
    private long lastMonthOrderAmt;

    /** 上月大贸下单金额 **/
    private long lastMonthDmOrderAmt;

    /** 上月跨境（海淘）下单金额 **/
    private long lastMonthHtOrderAmt;

    /** 上月下单商品类目数量 **/
    private long lastMonthOrderItemCateNum;

    /** 上月下单SKU数量 **/
    private long lastMonthOrderSkuNum;

    /** 上月下单天数 **/
    private long lastMonthOrderDaysNum;

    /** 上月订单数量 **/
    private long lastMonthOrderNum;

    /**
     * 本月SKU数
     */
    private long thisMonthOrderBSkuNum;
    /**
     * 上月SKU数
     */
    private long lastMonthOrderBSkuNum;

    /*GMV同期比例*/
    private String OrderAmtProportion;

    /*下单sku数同期比例*/
    private String OrderSkuNumProportion;

    /*下单B类sku数同期比例*/
    private String OrderBSkuNumProportion;

    /*下单类目数同期比例*/
    private String OrderItemCateNumProportion;

    /*下单天数同期比例*/
    private String OrderDaysNumProportion;

    /*订单数同期比例*/
    private String OrderNumProportion;

    /*大贸GMV同比*/
    private String DmOrderAmtProportion;

    /*海淘GMV同比*/
    private String HtOrderAmtProportion;

    public void setOrderBSkuNumProportion(String orderBSkuNumProportion) {
        OrderBSkuNumProportion = orderBSkuNumProportion;
    }

    public void setDmOrderAmtProportion(String dmOrderAmtProportion) {
        DmOrderAmtProportion = dmOrderAmtProportion;
    }

    public void setHtOrderAmtProportion(String htOrderAmtProportion) {
        HtOrderAmtProportion = htOrderAmtProportion;
    }

    public long getLastMonthOrderAmt() {
        return lastMonthOrderAmt;
    }


    public void setThisMonthOrderAmt(long thisMonthOrderAmt) {
        this.thisMonthOrderAmt = thisMonthOrderAmt;
    }

    public long getThisMonthDmOrderAmt() {
        return thisMonthDmOrderAmt;
    }

    public void setThisMonthDmOrderAmt(long thisMonthDmOrderAmt) {
        this.thisMonthDmOrderAmt = thisMonthDmOrderAmt;
    }

    public long getThisMonthHtOrderAmt() {
        return thisMonthHtOrderAmt;
    }

    public void setThisMonthHtOrderAmt(long thisMonthHtOrderAmt) {
        this.thisMonthHtOrderAmt = thisMonthHtOrderAmt;
    }

    public long getThisMonthOrderItemCateNum() {
        return thisMonthOrderItemCateNum;
    }

    public void setThisMonthOrderItemCateNum(long thisMonthOrderItemCateNum) {
        this.thisMonthOrderItemCateNum = thisMonthOrderItemCateNum;
    }


    public void setLastMonthOrderAmt(long lastMonthOrderAmt) {
        this.lastMonthOrderAmt = lastMonthOrderAmt;
    }

    public long getLastMonthDmOrderAmt() {
        return lastMonthDmOrderAmt;
    }

    public void setLastMonthDmOrderAmt(long lastMonthDmOrderAmt) {
        this.lastMonthDmOrderAmt = lastMonthDmOrderAmt;
    }

    public long getLastMonthHtOrderAmt() {
        return lastMonthHtOrderAmt;
    }

    public void setLastMonthHtOrderAmt(long lastMonthHtOrderAmt) {
        this.lastMonthHtOrderAmt = lastMonthHtOrderAmt;
    }

    public long getLastMonthOrderItemCateNum() {
        return lastMonthOrderItemCateNum;
    }

    public void setLastMonthOrderItemCateNum(long lastMonthOrderItemCateNum) {
        this.lastMonthOrderItemCateNum = lastMonthOrderItemCateNum;
    }


    public long getThisMonthOrderDaysNum() {
        return thisMonthOrderDaysNum;
    }

    public void setThisMonthOrderDaysNum(long thisMonthOrderDaysNum) {
        this.thisMonthOrderDaysNum = thisMonthOrderDaysNum;
    }

    public long getLastMonthOrderDaysNum() {
        return lastMonthOrderDaysNum;
    }

    public void setLastMonthOrderDaysNum(long lastMonthOrderDaysNum) {
        this.lastMonthOrderDaysNum = lastMonthOrderDaysNum;
    }

    public long getThisMonthOrderNum() {
        return thisMonthOrderNum;
    }

    public void setThisMonthOrderNum(long thisMonthOrderNum) {
        this.thisMonthOrderNum = thisMonthOrderNum;
    }

    public long getLastMonthOrderNum() {
        return lastMonthOrderNum;
    }

    public void setLastMonthOrderNum(long lastMonthOrderNum) {
        this.lastMonthOrderNum = lastMonthOrderNum;
    }

    public long getThisMonthOrderSkuNum() {
        return thisMonthOrderSkuNum;
    }

    public void setThisMonthOrderSkuNum(long thisMonthOrderSkuNum) {
        this.thisMonthOrderSkuNum = thisMonthOrderSkuNum;
    }

    public long getLastMonthOrderSkuNum() {
        return lastMonthOrderSkuNum;
    }

    public void setLastMonthOrderSkuNum(long lastMonthOrderSkuNum) {
        this.lastMonthOrderSkuNum = lastMonthOrderSkuNum;
    }

    public long getThisMonthOrderBSkuNum() {
        return thisMonthOrderBSkuNum;
    }

    public void setThisMonthOrderBSkuNum(long thisMonthOrderBSkuNum) {
        this.thisMonthOrderBSkuNum = thisMonthOrderBSkuNum;
    }

    public long getLastMonthOrderBSkuNum() {
        return lastMonthOrderBSkuNum;
    }

    public void setLastMonthOrderBSkuNum(long lastMonthOrderBSkuNum) {
        this.lastMonthOrderBSkuNum = lastMonthOrderBSkuNum;
    }


    public void setOrderAmtProportion(String orderAmtProportion) {
        OrderAmtProportion = orderAmtProportion;
    }

    public void setOrderSkuNumProportion(String orderSkuNumProportion) {
        OrderSkuNumProportion = orderSkuNumProportion;
    }

    public void setOrderItemCateNumProportion(String orderItemCateNumProportion) {
        OrderItemCateNumProportion = orderItemCateNumProportion;
    }


    public void setOrderDaysNumProportion(String orderDaysNumProportion) {
        OrderDaysNumProportion = orderDaysNumProportion;
    }


    public void setOrderNumProportion(String orderNumProportion) {
        OrderNumProportion = orderNumProportion;
    }

    public Double getShopScoreCurMonth() {
        return shopScoreCurMonth;
    }

    public void setShopScoreCurMonth(Double shopScoreCurMonth) {
        this.shopScoreCurMonth = shopScoreCurMonth;
    }

    public Double getShopScoreLastMonth() {
        return shopScoreLastMonth;
    }

    public void setShopScoreLastMonth(Double shopScoreLastMonth) {
        this.shopScoreLastMonth = shopScoreLastMonth;
    }

    public String getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(String lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public long getThisMonthOrderAmt() {
        return thisMonthOrderAmt;
    }

    public String getOrderAmtProportion() {
        return OrderAmtProportion;
    }

    public String getOrderSkuNumProportion() {
        return OrderSkuNumProportion;
    }

    public String getOrderBSkuNumProportion() {
        return OrderBSkuNumProportion;
    }

    public String getOrderItemCateNumProportion() {
        return OrderItemCateNumProportion;
    }

    public String getOrderDaysNumProportion() {
        return OrderDaysNumProportion;
    }

    public String getOrderNumProportion() {
        return OrderNumProportion;
    }

    public String getDmOrderAmtProportion() {
        return DmOrderAmtProportion;
    }

    public String getHtOrderAmtProportion() {
        return HtOrderAmtProportion;
    }

    public String getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(String lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }
}
