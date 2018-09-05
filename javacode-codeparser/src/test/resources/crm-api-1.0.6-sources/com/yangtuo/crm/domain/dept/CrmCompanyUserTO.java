package com.yangtuo.crm.domain.dept;

import java.io.Serializable;

/**
 * @author 慕愚
 * @create by 2018-4-10 15:24
 */
public class CrmCompanyUserTO implements Serializable{

    private static final long serialVersionUID = 2576145689830711773L;

    private String id;

    /**
     * 真实姓名
     */
    private String userRealName;

    /**
     * 所属部门
     */
    private CrmDeptTO department;

    public void setId(String id) {
        this.id = id;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getId() {

        return id;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public CrmDeptTO getDepartment() {
        return department;
    }

    public void setDepartment(CrmDeptTO department) {
        this.department = department;
    }
}
