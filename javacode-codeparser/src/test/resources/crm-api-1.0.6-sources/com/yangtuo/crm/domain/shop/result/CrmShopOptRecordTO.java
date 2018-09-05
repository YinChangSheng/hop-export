package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

public class CrmShopOptRecordTO implements Serializable{

    private static final long serialVersionUID = -3214114502288480020L;

    private String shopId;
    private String creator;
    private  String createTime;

    private String opTypeDesc;

    // 操作描述
    private String            recordDesc;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOpTypeDesc() {
        return opTypeDesc;
    }

    public void setOpTypeDesc(String opTypeDesc) {
        this.opTypeDesc = opTypeDesc;
    }

    public String getRecordDesc() {
        return recordDesc;
    }

    public void setRecordDesc(String recordDesc) {
        this.recordDesc = recordDesc;
    }
}
