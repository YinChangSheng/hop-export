package com.yangtuo.crm.api.common;


import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.dept.CrmCompanyUserTO;
import com.yangtuo.crm.domain.dept.CrmDeptTO;
import com.yangtuo.crm.domain.dept.DeptTreeNodeTO;

import java.util.List;

/**
 * 部门人员接口
 * @author yanwei.mao  2018.4.11
 */
public interface DeptUserApi {

    /**
     * 获取所有部门树,包括人员， 默认不包括人员
     *
     */
   ResultData<List<DeptTreeNodeTO>> getAllDept();

}
