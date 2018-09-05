package com.yangtuo.crm.domain.export.result;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiyu
 * @date 2018/5/21
 */
public class ExportTaskTO implements Serializable {

    private static final long serialVersionUID = -4403680852216995046L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 查询条件JSON
     */
    private String formJSON;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 邮件地址
     */
    private String email;

    /**
     * 任务类型
     */
    private String type;

    /**
     * 任务状态
     */
    private Integer status;

    /**
     * 任务开始时间（等同于createTime）
     */
    private Date startTime;

    /**
     * 任务结束时间
     */
    private Date finishTime;

    /**
     * 任务异步执行的机器
     */
    private String executor;

    /**
     * EXCEL文件地址
     */
    private String ossBucketName;

    /**
     * EXCEL文件地址
     */
    private String ossKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormJSON() {
        return formJSON;
    }

    public void setFormJSON(String formJSON) {
        this.formJSON = formJSON;
    }

    public String getOssBucketName() {
        return ossBucketName;
    }

    public void setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
    }

    public String getOssKey() {
        return ossKey;
    }

    public void setOssKey(String ossKey) {
        this.ossKey = ossKey;
    }
}
