package com.yangtuo.crm.domain.report;

import com.yangtuo.crm.domain.report.util.ArithmeticUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 门店指标数据
 *
 * @author jlf
 * @date 2016-08-09 09:55
 */
public class IndicatorInfoTO implements Serializable{

    /**
     * 管辖门店总数
     */
    private Integer ownerShopCnt;

    /**
     * VIP用户数
     */
    private Integer vipShopCnt;

    /**
     * 高级用户数
     */
    private Integer seniorShopCnt;

    /**
     * 开通代运营门店数
     */
    private Integer operShopCnt;

    /**
     * 门店绑定C总数
     */
    private Integer custBandCnt;

    /**
     * 冻结门店数
     */
    private Integer frozenShopCnt;

    /**
     * 本月总GMV
     */
    private Double allGmv;

    /**
     * 本月海淘GMV
     */
    private Double htGmv;

    /**
     * 本月大贸GMV
     */
    private Double dmGmv;

    /**
     * 大贸奶纸GMV
     */
    private Double dmNzGmv;

    /**
     * 跨境奶纸Gmv
     */
    private Double kjNzGmv;

    /**
     * 长尾GMV
     */
    private Double cwGmv;

    /**
     * B类GMV
     */
    private Double bGmv;

    /**
     * 下单B类门店数
     */
    private Integer monItemBOrdShopCnt;

    /**
     * 有效拜访门店数
     */
    private Integer effectVisitShopCnt;

    /**
     * 有效联系门店数
     */

    private Integer effectContactShopCnt;
    /**
     * 本月下单门店数
     */
    private Integer orderShopCnt;

    /**
     * 本月全类型下单门店数
     */
    private Integer alltypeOrderShopCnt;

    /**
     * 本月海淘下单门店数
     */
    private Integer htOrderShopCnt;

    /**
     * 本月大贸下单门店数
     */
    private Integer dmOrderShopCnt;

    /**
     * 本月新开门店数
     */
    private Integer newShopCnt;

    /**
     * 新签下单门店数
     */
    private Integer newOrderShopCnt;


    public Integer getMonItemBOrdShopCnt() {
        if (null == monItemBOrdShopCnt) {
            return 0;
        }
        return monItemBOrdShopCnt;
    }

    public void setMonItemBOrdShopCnt(Integer monItemBOrdShopCnt) {
        this.monItemBOrdShopCnt = monItemBOrdShopCnt;
    }

    public Integer getEffectVisitShopCnt() {
        if (null == effectVisitShopCnt) {
            return 0;
        }
        return effectVisitShopCnt;
    }

    public void setEffectVisitShopCnt(Integer effectVisitShopCnt) {
        this.effectVisitShopCnt = effectVisitShopCnt;
    }


    public Integer getEffectContactShopCnt() {
        if (null ==  effectContactShopCnt) {
            return 0;
        }
        return effectContactShopCnt;
    }

    public void setEffectContactShopCnt(Integer effectContactShopCnt) {
        this.effectContactShopCnt = effectContactShopCnt;
    }

    public Double getDmNzGmv() {
        if (null ==  dmNzGmv) {
            return 0D;
        }
        return dmNzGmv;
    }

    public void setDmNzGmv(Double dmNzGmv) {
        this.dmNzGmv = null==dmNzGmv?0D:dmNzGmv;
    }

    public Double getKjNzGmv() {
        if (null == kjNzGmv) {
            return 0D;
        }
        return kjNzGmv;
    }

    public void setKjNzGmv(Double kjNzGmv) {
        this.kjNzGmv = kjNzGmv;
    }

    public Double getCwGmv() {
        if (null == cwGmv) {
            return 0D;
        }
        return cwGmv;
    }

    public void setCwGmv(Double cwGmv) {
        this.cwGmv = cwGmv;
    }

    public Double getbGmv() {
        if (null == bGmv) {
            return 0D;
        }
        return bGmv;
    }

    public void setbGmv(Double bGmv) {
        this.bGmv = bGmv;
    }

    /**
     * GMV全国排名
     */

    private Integer ranking;

    private String provinceAreaId;

    private String provinceName;

    private String afterServer;
    private String afterServerId;

    /**
     * 添加人：阿健
     * 添加时间：17/1/3
     * 拜访记录数
     */
    private Integer visitRecordCnt;

    /**
     * 添加人：阿健
     * 添加时间：17/1/3
     * 拜访门店数
     */
    private Integer visitShopCnt;

    /* 新增微店门店总数 */
    private Integer wxdShopCnt;

    /* 当月微店下单门店数 */
    private Integer monWxdOrdShopCnt;

    /* 当月毛利额 */
    private Double monGrossProfitAmount;

    /* 当月毛利率 */
    private Double monGrossProfitRate;

    /* 当月普通门店数 */
    private Integer monCommonShopCnt;

    /* 当月GMV目标完成度 */
    private String allGmvProgress;

    /* 当月毛利额目标完成度 */
    private String grossProfitProgress;

    /* 当月毛利率目标完成度 */
    private String grossProfitRateProgress;

    /* 当月目标毛利额 */
    private String grossTargetProfitAmount;

    /* 当月目标毛利率 */
    private String grossTargetProfitRate;

    public Integer getVisitRecordCnt() {
        return visitRecordCnt;
    }

    public void setVisitRecordCnt(Integer visitRecordCnt) {

        this.visitRecordCnt = visitRecordCnt==null?0:visitRecordCnt;
    }

    public Integer getVisitShopCnt() {
        return visitShopCnt==null?0:visitShopCnt;
    }

    public void setVisitShopCnt(Integer visitShopCnt) {
        this.visitShopCnt = visitShopCnt==null?0:visitShopCnt;
    }

    public Integer getOwnerShopCnt() {
        return ownerShopCnt==null?0:ownerShopCnt;
    }

    public IndicatorInfoTO setOwnerShopCnt(Integer ownerShopCnt) {
        if (null == ownerShopCnt) {
            this.ownerShopCnt = 0;
            return this;
        }
        this.ownerShopCnt = ownerShopCnt;
        return this;
    }

    public Integer getVipShopCnt() {
        return vipShopCnt==null?0:vipShopCnt;
    }

    public IndicatorInfoTO setVipShopCnt(Integer vipShopCnt) {
        if (null == vipShopCnt) {
            this.vipShopCnt = 0;
            return this;
        }
        this.vipShopCnt = vipShopCnt;
        return this;
    }

    public Integer getSeniorShopCnt() {
        return seniorShopCnt==null?0:seniorShopCnt;
    }

    public IndicatorInfoTO setSeniorShopCnt(Integer seniorShopCnt) {
        if (null == seniorShopCnt) {
            this.seniorShopCnt = 0;
            return this;
        }
        this.seniorShopCnt = seniorShopCnt;
        return this;
    }

    public Integer getOperShopCnt() {
        return operShopCnt==null?0:operShopCnt;
    }

    public IndicatorInfoTO setOperShopCnt(Integer operShopCnt) {
        if (null == operShopCnt) {
            this.operShopCnt = 0;
            return this;
        }
        this.operShopCnt = operShopCnt;
        return this;
    }

    public Integer getCustBandCnt() {
        return custBandCnt==null?0:custBandCnt;
    }

    public IndicatorInfoTO setCustBandCnt(Integer custBandCnt) {
        if (null == custBandCnt) {
            this.custBandCnt = 0;
            return this;
        }
        this.custBandCnt = custBandCnt;
        return this;
    }

    public Integer getFrozenShopCnt() {
        return frozenShopCnt==null?0:frozenShopCnt;
    }

    public IndicatorInfoTO setFrozenShopCnt(Integer frozenShopCnt) {
        if (null == frozenShopCnt) {
            this.frozenShopCnt = 0;
            return this;
        }
        this.frozenShopCnt = frozenShopCnt;
        return this;
    }

    public void setAllGmv(Double allGmv) {
        this.allGmv = allGmv==null?0D:allGmv;
    }

    public void setHtGmv(Double htGmv) {
        this.htGmv = htGmv==null?0D:htGmv;
    }

    public void setDmGmv(Double dmGmv) {
        this.dmGmv = dmGmv==null?0D:dmGmv;
    }

    public Double getAllGmv() {
        return allGmv==null?0D:allGmv;
    }

    public Double getHtGmv() {
        return htGmv== null?0D:htGmv;
    }

    public Double getDmGmv() {
        return dmGmv==null?0D:dmGmv;
    }

    public String getAllGmvStr() {
        return this.allGmv==null?"": ArithmeticUtil.getMoneyByAccountPattern(this.allGmv);
    }

    public String getHtGmvStr() {
        return this.allGmv==null?"": ArithmeticUtil.getMoneyByAccountPattern(this.htGmv);
    }


    public String getDmGmvStr() {
        return this.allGmv==null?"": ArithmeticUtil.getMoneyByAccountPattern(this.dmGmv);
    }


    public Integer getOrderShopCnt() {
        return orderShopCnt==null?0:orderShopCnt;
    }

    public IndicatorInfoTO setOrderShopCnt(Integer orderShopCnt) {
        if (null == orderShopCnt){
            this.orderShopCnt = 0;
            return this;
        }
        this.orderShopCnt = orderShopCnt;
        return this;
    }

    public Integer getAlltypeOrderShopCnt() {
        return alltypeOrderShopCnt==null?0:alltypeOrderShopCnt;
    }

    public IndicatorInfoTO setAlltypeOrderShopCnt(Integer alltypeOrderShopCnt) {
        if (null == alltypeOrderShopCnt){
            this.alltypeOrderShopCnt = 0;
            return this;
        }
        this.alltypeOrderShopCnt = alltypeOrderShopCnt;
        return this;
    }

    public Integer getHtOrderShopCnt() {
        return htOrderShopCnt==null?0:htOrderShopCnt;
    }

    public IndicatorInfoTO setHtOrderShopCnt(Integer htOrderShopCnt) {
        if (null == htOrderShopCnt){
            this.htOrderShopCnt = 0;
            return this;
        }
        this.htOrderShopCnt = htOrderShopCnt;
        return this;
    }

    public Integer getDmOrderShopCnt() {
        return dmOrderShopCnt==null?0:dmOrderShopCnt;
    }

    public IndicatorInfoTO setDmOrderShopCnt(Integer dmOrderShopCnt) {
        if (null == dmOrderShopCnt){
            this.dmOrderShopCnt = 0;
            return this;
        }
        this.dmOrderShopCnt = dmOrderShopCnt;
        return this;
    }

    public Integer getNewShopCnt() {
        return newShopCnt==null?0:newShopCnt;
    }

    public IndicatorInfoTO setNewShopCnt(Integer newShopCnt) {
        if (null == newShopCnt){
            this.newShopCnt = 0;
            return this;
        }
        this.newShopCnt = newShopCnt;
        return this;
    }

    public Integer getNewOrderShopCnt() {
        return newOrderShopCnt==null?0:newOrderShopCnt;
    }

    public IndicatorInfoTO setNewOrderShopCnt(Integer newOrderShopCnt) {
        if (null == newOrderShopCnt){
            this.newOrderShopCnt = 0;
            return this;
        }
        this.newOrderShopCnt = newOrderShopCnt;
        return this;
    }

    public Integer getRanking() {
        return ranking==null?0:ranking;
    }

    public IndicatorInfoTO setRanking(Integer ranking) {
        if (null == ranking){
            this.ranking = 0;
            return this;
        }
        this.ranking = ranking;
        return this;
    }


    public String getProvinceAreaId() {
        return StringUtils.isEmpty(provinceAreaId)?"":provinceAreaId;
    }

    public void setProvinceAreaId(String provinceAreaId) {
        this.provinceAreaId = StringUtils.isEmpty(provinceAreaId)?"":provinceAreaId;
    }

    public String getAfterServer() {
        return StringUtils.isEmpty(afterServer)?"":afterServer;
    }

    public void setAfterServer(String afterServer) {
        this.afterServer = StringUtils.isEmpty(afterServer)?"":afterServer;
    }

    public String getAfterServerId() {
        return StringUtils.isEmpty(afterServerId)?"":afterServerId;
    }

    public IndicatorInfoTO setAfterServerId(String afterServerId) {
        this.afterServerId = StringUtils.isEmpty(afterServerId)?"":afterServerId;
        return this;
    }

    public String getProvinceName() {
        return StringUtils.isEmpty(provinceName)?"":provinceName;
    }

    public IndicatorInfoTO setProvinceName(String provinceName) {
        this.provinceName = StringUtils.isEmpty(provinceName)?"":provinceName;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Integer getWxdShopCnt() {
        if(null == wxdShopCnt) return 0;
        return wxdShopCnt;
    }

    public void setWxdShopCnt(Integer wxdShopCnt) {
        this.wxdShopCnt = wxdShopCnt;
    }

    public Integer getMonWxdOrdShopCnt() {
        if(null == monWxdOrdShopCnt) return 0;
        return monWxdOrdShopCnt;
    }

    public void setMonWxdOrdShopCnt(Integer monWxdOrdShopCnt) {
        this.monWxdOrdShopCnt = monWxdOrdShopCnt;
    }

    public Double getMonGrossProfitAmount() {
        if(null == monGrossProfitAmount) return new Double("0");
        return monGrossProfitAmount;
    }

    public void setMonGrossProfitAmount(Double monGrossProfitAmount) {
        this.monGrossProfitAmount = monGrossProfitAmount;
    }

    public Double getMonGrossProfitRate() {
        if(null == monGrossProfitRate) return new Double("0");
        return monGrossProfitRate;
    }

    public void setMonGrossProfitRate(Double monGrossProfitRate) {
        this.monGrossProfitRate = monGrossProfitRate;
    }

    public Integer getMonCommonShopCnt() {
        if(null == monCommonShopCnt) return 0;
        return monCommonShopCnt;
    }

    public void setMonCommonShopCnt(Integer monCommonShopCnt) {
        this.monCommonShopCnt = monCommonShopCnt;
    }

    public String getAllGmvProgress() {
        if (StringUtils.isEmpty(allGmvProgress)){
            return "";
        }
        return allGmvProgress;
    }

    public void setAllGmvProgress(String allGmvProgress) {
        this.allGmvProgress = allGmvProgress;
    }

    public String getGrossProfitProgress() {
        if (StringUtils.isEmpty(grossProfitProgress)){
            return "";
        }
        return grossProfitProgress;
    }

    public void setGrossProfitProgress(String grossProfitProgress) {
        this.grossProfitProgress = grossProfitProgress;
    }

    public String getGrossProfitRateProgress() {
        if (StringUtils.isEmpty(grossProfitRateProgress)){
            return "";
        }
        return grossProfitRateProgress;
    }

    public void setGrossProfitRateProgress(String grossProfitRateProgress) {
        this.grossProfitRateProgress = grossProfitRateProgress;
    }

    public String getGrossTargetProfitAmount() {
        if (StringUtils.isEmpty(grossTargetProfitAmount)){
            return "";
        }
        return grossTargetProfitAmount;
    }

    public void setGrossTargetProfitAmount(String grossTargetProfitAmount) {
        this.grossTargetProfitAmount = grossTargetProfitAmount;
    }

    public String getGrossTargetProfitRate() {
        if (StringUtils.isEmpty(grossTargetProfitRate)){
            return "";
        }
        return grossTargetProfitRate;
    }

    public void setGrossTargetProfitRate(String grossTargetProfitRate) {
        this.grossTargetProfitRate = grossTargetProfitRate;
    }
}
