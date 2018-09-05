package com.yangtuo.crm.domain.shopServerLog;

import java.io.Serializable;

/**
 * @author 栋
 * @create by 2018-06-11 上午10:04
 */
public class ShopServerLogForm implements Cloneable,Serializable{

    /**
     * 门店ID
     */
    private String shopId;
    /**
     * 服务人员ID
     */
    private String serverId;
    /**
     * 出入库类型
     */
    private Integer putType;
    /**
     * 出入库原因
     */
    private String putReason;
    /**
     * 出入库门店阶段
     */
    private Integer shopPutStage;
    /**
     * 操作人userId
     */
    private String operator;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public Integer getPutType() {
        return putType;
    }

    public void setPutType(Integer putType) {
        this.putType = putType;
    }

    public String getPutReason() {
        return putReason;
    }

    public void setPutReason(String putReason) {
        this.putReason = putReason;
    }

    public Integer getShopPutStage() {
        return shopPutStage;
    }

    public void setShopPutStage(Integer shopPutStage) {
        this.shopPutStage = shopPutStage;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
