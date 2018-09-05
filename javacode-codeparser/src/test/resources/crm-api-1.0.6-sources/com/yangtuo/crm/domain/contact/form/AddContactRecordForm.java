package com.yangtuo.crm.domain.contact.form;

import java.io.Serializable;

/**
 * Created by muyu.myw on 2017/9/15.
 */
public class AddContactRecordForm implements Serializable {

    private static final long serialVersionUID = -1531651074613111674L;

    /**
     * 小记类型 1 有效 2 无效
     */
    private Integer           type;

    /**
     * 业务id , 门店id
     */
    private String            shopId;
    /**
     * 本次联系人id 关联 t_linker
     */
    private String            linkerId;
    /**
     * 成熟度
     */
    private String            grade;

    /**
     * 预约门店联系人
     */
    private String            nextLinkerId;
    /**
     * 预约下次联系时间
     */
    private String            nextContactTime;
    /**
     * 联系内容
     */
    private String            content;
    /**
     * 计划拜访内容
     */
    private String            planContent;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNextLinkerId() {
        return nextLinkerId;
    }

    public void setNextLinkerId(String nextLinkerId) {
        this.nextLinkerId = nextLinkerId;
    }

    public String getNextContactTime() {
        return nextContactTime;
    }

    public void setNextContactTime(String nextContactTime) {
        this.nextContactTime = nextContactTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }
}
