package com.yangtuo.crm.domain.report;

import com.yangtuo.crm.domain.report.util.ArithmeticUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * 门店概览数据
 *
 * @author jlf
 * @date 2016-08-09 09:55
 */
public class ShopDataSurveyTO implements Serializable {

    /**
     * 当前时间指标数据
     */
    private IndicatorInfoTO thisTimeData;

    /**
     * 上月同期指标数据
     */
    private IndicatorInfoTO overLastMonthData;

    /**
     * 上月总指标数据
     */
    private IndicatorInfoTO lastMonthData;

    /**
     * 所属省编码
     */
    private Long provinceAreaId;

    /**
     * 总GMV同比变化
     */
    private String allGmvIncreaseRateStr;

    /**
     * 海淘GMV同比变化
     */
    private String htGmvIncreaseRateStr;

    /**
     * 大贸GMV同比变化
     */
    private String dmGmvIncreaseRateStr;

    /**
     * 下单门店数同比变化
     */
    private String orderShopCntIncreaseRateStr;

    /**
     * 所有访问门店数
     */
    private String visitShopCntIncreaseRateStr;
    /**
     * 全类型下单门店数同比变化
     */
    private String alltypeOrderShopCntIncreaseRateStr;

    /**
     * 海淘下单门店数同比变化
     */
    private String htOrderShopCntIncreaseRateStr;

    /**
     * 大贸下单门店数同比变化
     */
    private String dmOrderShopCntIncreaseRateStr;

    /**
     * 新开门店数同比变化
     */
    private String newShopCntIncreaseRateStr;

    /**
     * 新签下单门店数同比变化
     */
    private String newOrderShopCntIncreaseRateStr;

    /**
     * 大贸奶纸GMV同比变化
     */
    private String dmNzGmvIncreaseRateStr;

    /**
     * 跨境奶纸Gmv同比变化
     */
    private String kjNzGmvIncreaseRateStr;

    /**
     * 长尾GMV同比变化
     */
    private String cwGmvIncreaseRateStr;

    /**
     * B类GMV同比变化
     */
    private String bGmvIncreaseRateStr;

    /**
     * 有效拜访门店数同比变化
     */
    private String effectVisitShopCntIncreaseRateStr;

    /**
     * B类 订单下单
     */
    private String monItemBOrdShopCntIncreaseRateStr;

    /**
     * 有效联系门店数同比变化
     */

    private String effectContactShopCntIncreaseRateStr;

    /**
     * 管辖区域
     */
    private String areaName;

    /**
     * BD/省长/总监姓名
     */
    private String ownerName;

    /**
     * 管辖人数
     */
    private Integer underlingNum;



    /* VIP门店同比（%） */
    private String vipShopRateStr;

    /* 高级门店同比（%） */
    private String seniorShopRateStr;

    /* 普通门店同比（%） */
    private String commonShopRateStr;

    /* 新增微店门店同比（%） */
    private String wxdShopRateStr;

    /* 微店下单门店同比（%）*/
    private String monWxdOrdShopRateStr;

    public Integer getUnderlingNum() {
        return underlingNum==null?0:underlingNum;
    }

    public ShopDataSurveyTO setUnderlingNum(Integer underlingNum) {
        this.underlingNum = underlingNum;
        return this;
    }

    public IndicatorInfoTO getThisTimeData() {
        return thisTimeData;
    }

    public ShopDataSurveyTO setThisTimeData(IndicatorInfoTO thisTimeData) {
        this.thisTimeData = thisTimeData;
        return this;
    }

    public IndicatorInfoTO getOverLastMonthData() {
        return overLastMonthData;
    }

    public ShopDataSurveyTO setOverLastMonthData(IndicatorInfoTO overLastMonthData) {
        this.overLastMonthData = overLastMonthData;
        return this;
    }

    public IndicatorInfoTO getLastMonthData() {
        return lastMonthData;
    }

    public ShopDataSurveyTO setLastMonthData(IndicatorInfoTO lastMonthData) {
        this.lastMonthData = lastMonthData;
        return this;
    }

    public Long getProvinceAreaId() {
        return provinceAreaId==null?0L:provinceAreaId;
    }

    public ShopDataSurveyTO setProvinceAreaId(Long provinceAreaId) {
        this.provinceAreaId = provinceAreaId;
        return this;
    }

    public String getAllGmvIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getAllGmv()-overLastMonthData.getAllGmv() ,overLastMonthData.getAllGmv());
    }

    public String getHtGmvIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getHtGmv()-overLastMonthData.getHtGmv(),overLastMonthData.getHtGmv());
    }


    public String getDmGmvIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getDmGmv()-overLastMonthData.getDmGmv(),overLastMonthData.getDmGmv());
    }

    public String getOrderShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getOrderShopCnt()-overLastMonthData.getOrderShopCnt(),overLastMonthData.getOrderShopCnt());
    }



    public String getAlltypeOrderShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getAlltypeOrderShopCnt()-overLastMonthData.getAlltypeOrderShopCnt(),overLastMonthData.getAlltypeOrderShopCnt());
    }


    public String getHtOrderShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getHtOrderShopCnt()-overLastMonthData.getHtOrderShopCnt(),overLastMonthData.getHtOrderShopCnt());
    }


    public String getDmOrderShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getDmOrderShopCnt()-overLastMonthData.getDmOrderShopCnt(),overLastMonthData.getDmOrderShopCnt());
    }

    public String getNewShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getNewShopCnt()-overLastMonthData.getNewShopCnt(),overLastMonthData.getNewShopCnt());
    }


    public String getNewOrderShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getNewOrderShopCnt()-overLastMonthData.getNewOrderShopCnt(),overLastMonthData.getNewOrderShopCnt());
    }

    public String getAreaName() {
        return areaName==null?StringUtils.EMPTY:areaName;
    }

    public ShopDataSurveyTO setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public String getOwnerName() {
        if (ownerName == null) {
            return StringUtils.EMPTY;
        }
        return ownerName;
    }

    public String getDmNzGmvIncreaseRateStr(){
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getDmNzGmv()-overLastMonthData.getDmNzGmv(),overLastMonthData.getDmNzGmv());
    }

    public String getKjNzGmvIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getKjNzGmv()-overLastMonthData.getKjNzGmv(),overLastMonthData.getKjNzGmv());
    }

    public String getCwGmvIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getCwGmv()-overLastMonthData.getCwGmv(),overLastMonthData.getCwGmv());
    }

    public String getbGmvIncreaseRateStr(){
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getbGmv()-overLastMonthData.getbGmv(),overLastMonthData.getbGmv());
    }


    public String getEffectVisitShopCntIncreaseRateStr(){
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getEffectVisitShopCnt()-overLastMonthData.getEffectVisitShopCnt(),overLastMonthData.getEffectVisitShopCnt());
    }

    public String getMonItemBOrdShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getMonItemBOrdShopCnt()-overLastMonthData.getMonItemBOrdShopCnt(),overLastMonthData.getMonItemBOrdShopCnt());
    }

    public void setMonItemBOrdShopCntIncreaseRateStr(String monItemBOrdShopCntIncreaseRateStr) {
        this.monItemBOrdShopCntIncreaseRateStr = monItemBOrdShopCntIncreaseRateStr;
    }

    public String getEffectContactShopCntIncreaseRateStr(){
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getEffectContactShopCnt()-overLastMonthData.getEffectContactShopCnt(),overLastMonthData.getEffectContactShopCnt());
    }

    public ShopDataSurveyTO setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getVisitShopCntIncreaseRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(thisTimeData.getVisitShopCnt()-overLastMonthData.getVisitShopCnt(),overLastMonthData.getVisitShopCnt());
    }



    public void setVisitShopCntIncreaseRateStr(String visitShopCntIncreaseRateStr) {
        this.visitShopCntIncreaseRateStr = visitShopCntIncreaseRateStr;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public void setAllGmvIncreaseRateStr(String allGmvIncreaseRateStr) {
        this.allGmvIncreaseRateStr = allGmvIncreaseRateStr;
    }

    public void setHtGmvIncreaseRateStr(String htGmvIncreaseRateStr) {
        this.htGmvIncreaseRateStr = htGmvIncreaseRateStr;
    }

    public void setDmGmvIncreaseRateStr(String dmGmvIncreaseRateStr) {
        this.dmGmvIncreaseRateStr = dmGmvIncreaseRateStr;
    }

    public void setOrderShopCntIncreaseRateStr(String orderShopCntIncreaseRateStr) {
        this.orderShopCntIncreaseRateStr = orderShopCntIncreaseRateStr;
    }



    public void setAlltypeOrderShopCntIncreaseRateStr(String alltypeOrderShopCntIncreaseRateStr) {
        this.alltypeOrderShopCntIncreaseRateStr = alltypeOrderShopCntIncreaseRateStr;
    }

    public void setHtOrderShopCntIncreaseRateStr(String htOrderShopCntIncreaseRateStr) {
        this.htOrderShopCntIncreaseRateStr = htOrderShopCntIncreaseRateStr;
    }

    public void setDmOrderShopCntIncreaseRateStr(String dmOrderShopCntIncreaseRateStr) {
        this.dmOrderShopCntIncreaseRateStr = dmOrderShopCntIncreaseRateStr;
    }

    public void setNewShopCntIncreaseRateStr(String newShopCntIncreaseRateStr) {
        this.newShopCntIncreaseRateStr = newShopCntIncreaseRateStr;
    }

    public void setNewOrderShopCntIncreaseRateStr(String newOrderShopCntIncreaseRateStr) {
        this.newOrderShopCntIncreaseRateStr = newOrderShopCntIncreaseRateStr;
    }

    public void setDmNzGmvIncreaseRateStr(String dmNzGmvIncreaseRateStr){
        this.dmNzGmvIncreaseRateStr = dmNzGmvIncreaseRateStr;
    }

    public void setKjNzGmvIncreaseRateStr(String kjNzGmvIncreaseRateStr) {
        this.kjNzGmvIncreaseRateStr = kjNzGmvIncreaseRateStr;
    }

    public void setCwGmvIncreaseRateStr(String cwGmvIncreaseRateStr) {
        this.cwGmvIncreaseRateStr = cwGmvIncreaseRateStr;
    }

    public void setbGmvIncreaseRateStr(String bGmvIncreaseRateStr){
        this.bGmvIncreaseRateStr = bGmvIncreaseRateStr;
    }

    public String getVipShopRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(sub(thisTimeData.getVipShopCnt(), overLastMonthData.getVipShopCnt()),overLastMonthData.getVipShopCnt());
    }

    public void setVipShopRateStr(String vipShopRateStr) {
        this.vipShopRateStr = vipShopRateStr;
    }

    public String getSeniorShopRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(sub(thisTimeData.getSeniorShopCnt(), overLastMonthData.getSeniorShopCnt()),overLastMonthData.getSeniorShopCnt());
    }

    public void setSeniorShopRateStr(String seniorShopRateStr) {
        this.seniorShopRateStr = seniorShopRateStr;
    }

    public String getCommonShopRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(sub(thisTimeData.getMonCommonShopCnt(), overLastMonthData.getMonCommonShopCnt()),overLastMonthData.getMonCommonShopCnt());
    }

    public void setCommonShopRateStr(String commonShopRateStr) {
        this.commonShopRateStr = commonShopRateStr;
    }

    public String getWxdShopRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(sub(thisTimeData.getWxdShopCnt(), overLastMonthData.getWxdShopCnt()),overLastMonthData.getWxdShopCnt());
    }

    public void setWxdShopRateStr(String wxdShopRateStr) {
        this.wxdShopRateStr = wxdShopRateStr;
    }

    public String getMonWxdOrdShopRateStr() {
        if (notNull()){
            return StringUtils.EMPTY;
        }
        return ArithmeticUtil.getPercent(sub(thisTimeData.getMonWxdOrdShopCnt(),overLastMonthData.getMonWxdOrdShopCnt()),overLastMonthData.getMonWxdOrdShopCnt());
    }

    public void setMonWxdOrdShopRateStr(String monWxdOrdShopRateStr) {
        this.monWxdOrdShopRateStr = monWxdOrdShopRateStr;
    }

    public void setEffectVisitShopCntIncreaseRateStr(String effectVisitShopCntIncreaseRateStr){
        this.effectVisitShopCntIncreaseRateStr=effectVisitShopCntIncreaseRateStr;
    }

    public void setEffectContactShopCntIncreaseRateStr(String effectContactShopCntIncreaseRateStr){
        this.effectContactShopCntIncreaseRateStr = effectContactShopCntIncreaseRateStr;
    }

    private boolean notNull() {
        return null == thisTimeData || null == overLastMonthData;
    }

    Integer sub(Integer c, Integer m){
        if(null == c && null == m){
            return 0;
        }
        if(null == c){
            return 0-m;
        }
        if(null == m){
            return  c;
        }
        return c- m;
    }
}
