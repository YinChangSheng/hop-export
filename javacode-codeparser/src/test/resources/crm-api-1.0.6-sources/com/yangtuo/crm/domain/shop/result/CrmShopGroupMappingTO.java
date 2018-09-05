package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 门店所属分组TO
 *
 * @author 木鸢
 * create by 2018-04-16 10:20
 */
public class CrmShopGroupMappingTO implements Serializable{

    private static final long serialVersionUID = -8556466248370287905L;
    private Long id;

    private String shopId;

    private Long groupId;

    private String groupName;

    //1已加入 0未加入
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
