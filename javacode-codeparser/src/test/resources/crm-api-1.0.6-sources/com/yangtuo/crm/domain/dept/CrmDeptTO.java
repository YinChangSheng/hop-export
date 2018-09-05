package com.yangtuo.crm.domain.dept;

import java.io.Serializable;

/**
 * @author muyu
 * create by 2018-4-10 15:24
 */
public class CrmDeptTO implements Serializable{

    private static final long serialVersionUID = 3607319622969744638L;

    private Long id;

    /**
     * 上级主管
     */
    private Long parentId;

    /**
     * 部门名称
     */
    private String name;

    private Integer sort;

    /**
     * 部门主管
     */
    private CrmCompanyUserTO manager;


    public void setId(Long id) {
        this.id = id;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {

        return id;
    }

    public Long getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public CrmCompanyUserTO getManager() {
        return manager;
    }

    public void setManager(CrmCompanyUserTO manager) {
        this.manager = manager;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
