package com.yangtuo.crm.domain.dept;

/**
 * @author 栋
 * @create by 2017-10-11 17:14
 */
public class CrmDepartmentTO{

    /**
     * 部门id
     */
    private Long id;

    /**
     * 上级部门id
     */
    private Long parentId;

    /**
     * 部门排序
     */
    private Integer sort;

    /**
     * 部门名字
     */
    private String name;

    /**
     * 部门leader的userId
     */
    private String charger;

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

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSort() {

        return sort;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getCharger() {

        return charger;
    }


}
