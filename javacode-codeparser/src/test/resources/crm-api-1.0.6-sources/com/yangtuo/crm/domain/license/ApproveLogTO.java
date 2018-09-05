package com.yangtuo.crm.domain.license;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 资质审核操作记录表
 * @author muyu
 */
public class ApproveLogTO implements Serializable{

    private static final long serialVersionUID = -9150349436380820461L;
    /**
     * id
     */
    private Long id;

    /**
     * 业务ID
     */
    private String bizId;

    /**
     * 操作类型
     * @see
     */
    private Integer operationType;

    private String operationTypeDesc;

    private String remark;

    private String creator;

    private String createTime;

    /**
     * 审核说明
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOperationTypeDesc() {
        return operationTypeDesc;
    }

    public void setOperationTypeDesc(String operationTypeDesc) {
        this.operationTypeDesc = operationTypeDesc;
    }
}
