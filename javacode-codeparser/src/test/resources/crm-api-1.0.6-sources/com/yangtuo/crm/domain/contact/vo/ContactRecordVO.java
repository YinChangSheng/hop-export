package com.yangtuo.crm.domain.contact.vo;

import java.io.Serializable;

/**
 * @author 飞影
 * @create by 2018-04-09 21:25
 */
public class ContactRecordVO implements Serializable {

    private static final long serialVersionUID = -4212718644898997334L;

    private Long              id;
    private String            visitOrderId;
    private String            visitTime;
    private String            shopId;
    private String            shopName;
    private String            shopStage;
    private String            linkerId;
    private String            linkerName;
    private String            linkerMobile;
    private String            visitorId;
    private String            visitName;
    private String            visitType;
    private String            visitMethod;
    private String            visitContent;
    private String            gradeDesc;
    private String            nextContactTime;
    private String            planContent;
    private String            shopStatus;

    public String getVisitOrderId() {
        return visitOrderId;
    }

    public void setVisitOrderId(String visitOrderId) {
        this.visitOrderId = visitOrderId;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
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

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }

    public String getVisitMethod() {
        return visitMethod;
    }

    public void setVisitMethod(String visitMethod) {
        this.visitMethod = visitMethod;
    }

    public String getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(String visitContent) {
        this.visitContent = visitContent;
    }

    public String getGradeDesc() {
        return gradeDesc;
    }

    public void setGradeDesc(String gradeDesc) {
        this.gradeDesc = gradeDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNextContactTime() {
        return nextContactTime;
    }

    public void setNextContactTime(String nextContactTime) {
        this.nextContactTime = nextContactTime;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getShopStatus() {
        return shopStatus;
    }
}
