package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;
import java.util.Date;

/**
 * 门店跟进、联系模型
 *
 * @author 木鸢
 * create by2018-04-03 16:21
 */
public class ShopContractTo implements Serializable{

    private static final long serialVersionUID = 948586309932035325L;
    /**
     * 最后拜访时间
     */
    private Date lastContactTime;

    /**
     * 上次拜访内容
     */
    private String lastContactContent;

    /**
     * 最后联系人
     */
    private String lastLinkerId;

    private String lastLinkerPhone;

    public String getLastLinkerPhone() {
        return lastLinkerPhone;
    }

    public void setLastLinkerPhone(String lastLinkerPhone) {
        this.lastLinkerPhone = lastLinkerPhone;
    }

    public String getLastLinkerId() {
        return lastLinkerId;
    }

    public void setLastLinkerId(String lastLinkerId) {
        this.lastLinkerId = lastLinkerId;
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
}
