package com.yangtuo.crm.domain.contact.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 飞影
 * @create by 2018-04-09 21:25
 */
public class ContactPlanVO implements Serializable {

    private static final long   serialVersionUID = 3856603528771113088L;

    private Long                planId;
    private String              shopId;
    private String              shopName;
    private String             shopStatus;
    private String              shopStage;
    private String              linkerId;
    private String              linkerName;
    private String              linkerMobile;
    private String              planTime;
    private String              visitorId;
    private String              visitName;
    private String              status;
    private String              content;
    private Map<String, String> lastVisit        = new HashMap<>();

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

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

    public String getShopStage() {
        return shopStage;
    }

    public void setShopStage(String shopStage) {
        this.shopStage = shopStage;
    }

    public String getLinkerId() {
        return linkerId;
    }

    public void setLinkerId(String linkerId) {
        this.linkerId = linkerId;
    }

    public String getLinkerName() {
        return linkerName;
    }

    public void setLinkerName(String linkerName) {
        this.linkerName = linkerName;
    }

    public String getLinkerMobile() {
        return linkerMobile;
    }

    public void setLinkerMobile(String linkerMobile) {
        this.linkerMobile = linkerMobile;
    }

    public String getPlanTime() {
        return planTime;
    }

    public void setPlanTime(String planTime) {
        this.planTime = planTime;
    }

    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getVisitName() {
        return visitName;
    }

    public void setVisitName(String visitName) {
        this.visitName = visitName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(Map<String, String> lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }
}
