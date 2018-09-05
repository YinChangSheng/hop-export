package com.yangtuo.crm.domain.publicsea.to;

import com.yangtuo.crm.domain.shop.result.ShopServerTo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 门店公海记录
 *
 * @author kai.KingS
 * @create by 2018-06-06 下午8:35
 */
public class PublicSeaShopTO implements Serializable {

    private static final long serialVersionUID = 2918020601096545673L;

    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 账号类型(连锁类型)
     *
     * @see1 1单体 2连锁
     */
    private String shopTypeStr;

    /**
     * 上次服务人员
     */
    private String lastServer;

    /**
     * 最近下单时间
     */
    private String lastOrderTime;

    /**
     * 最后拜访时间 (前端要求传Date)
     */
    private String lastVisitTime;

    /**
     * 最近有效拜访时间
     */
    private Date lastContactTime;

    /**
     * 上次拜访内容
     */
    private String lastContactContent;

    /**
     * 入公海时间 (前端要求传Date)
     */
    private Date inputPublicSeaTime;

    /**
     * 入公海原因
     */
    private String inputPublicSeaReason;

    /**
     * 入公海备注
     */
    private String inputPublicSeaRemark;

    /**
     * 门店服务人员
     */
    private List<ShopServerTo> shopServers;

    /**
     *  1 未开户
     *  2 开户
     *  3 待回访
     *  4 正常
     *  5 冻结
     *  6 未合作
     */
    private String shopStatus;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopTypeStr() {
        return shopTypeStr;
    }

    public void setShopTypeStr(String shopTypeStr) {
        this.shopTypeStr = shopTypeStr;
    }

    public String getLastServer() {
        return lastServer;
    }

    public void setLastServer(String lastServer) {
        this.lastServer = lastServer;
    }

    public String getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(String lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public String getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(String lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public Date getLastContactTime() {
        return lastContactTime;
    }

    public void setLastContactTime(Date lastContactTime) {
        this.lastContactTime = lastContactTime;
    }

    public String getLastContactContent() {
        return lastContactContent;
    }

    public void setLastContactContent(String lastContactContent) {
        this.lastContactContent = lastContactContent;
    }

    public Date getInputPublicSeaTime() {
        return inputPublicSeaTime;
    }

    public void setInputPublicSeaTime(Date inputPublicSeaTime) {
        this.inputPublicSeaTime = inputPublicSeaTime;
    }

    public String getInputPublicSeaReason() {
        return inputPublicSeaReason;
    }

    public void setInputPublicSeaReason(String inputPublicSeaReason) {
        this.inputPublicSeaReason = inputPublicSeaReason;
    }

    public List<ShopServerTo> getShopServers() {
        return shopServers;
    }

    public void setShopServers(List<ShopServerTo> shopServers) {
        this.shopServers = shopServers;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getInputPublicSeaRemark() {
        return inputPublicSeaRemark;
    }

    public void setInputPublicSeaRemark(String inputPublicSeaRemark) {
        this.inputPublicSeaRemark = inputPublicSeaRemark;
    }
}
