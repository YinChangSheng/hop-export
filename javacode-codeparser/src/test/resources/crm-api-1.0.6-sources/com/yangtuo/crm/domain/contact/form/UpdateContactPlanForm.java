package com.yangtuo.crm.domain.contact.form;

import java.io.Serializable;

/**
 * @author 飞影
 * @create by 2018-04-10 15:12
 */
public class UpdateContactPlanForm implements Serializable {

    private static final long serialVersionUID = 3570677365661911468L;

    private Long              planId;
    private String            shopId;
    private String            linkerId;
    private String            contactTime;
    private String            content;

    /**
     * 表单请求创建人ID
     */
    private String            formCreator;

    public String getFormCreator() {
        return formCreator;
    }

    public void setFormCreator(String formCreator) {
        this.formCreator = formCreator;
    }

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

    public String getLinkerId() {
        return linkerId;
    }

    public void setLinkerId(String linkerId) {
        this.linkerId = linkerId;
    }

    public String getContactTime() {
        return contactTime;
    }

    public void setContactTime(String contactTime) {
        this.contactTime = contactTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
