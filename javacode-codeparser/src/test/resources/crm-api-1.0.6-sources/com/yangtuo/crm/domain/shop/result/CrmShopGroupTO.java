package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiyu
 * @date 2018/5/17
 */
public class CrmShopGroupTO implements Serializable {

    private static final long serialVersionUID = -5426417638184848556L;
    private Long id;

    /**
     * 分组名称
     */
    private String name;

    /**
     * 分组描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 最后编辑时间
     */
    private Date editTime;

    /**
     * 最后编辑人
     */
    private String editor;

    /**
     * 是否已删除
     */
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}
