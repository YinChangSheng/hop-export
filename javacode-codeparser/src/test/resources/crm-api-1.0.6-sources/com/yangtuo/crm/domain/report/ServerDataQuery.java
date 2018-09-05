package com.yangtuo.crm.domain.report;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.io.Serializable;
import java.util.List;

/**
 * @author 栋
 * @create by 2018-04-19 下午2:57
 */
public class ServerDataQuery extends CrmBaseQuery implements Serializable {

    /**
     * 数据类型（所有，我的，下属）
     */
    private Integer serverDataType;
    /**
     * 查询日期
     */
    private String queryDateStr;
    /**
     * 部门 id
     */
    private Long deptId;
    /**
     * BD id列表
     */
    private List<String> afterServerIdList;

    public String getQueryDateStr() {
        return queryDateStr;
    }

    public void setQueryDateStr(String queryDateStr) {
        this.queryDateStr = queryDateStr;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public List<String> getAfterServerIdList() {
        return afterServerIdList;
    }

    public void setAfterServerIdList(List<String> afterServerIdList) {
        this.afterServerIdList = afterServerIdList;
    }

    public Integer getServerDataType() {
        return serverDataType;
    }

    public void setServerDataType(Integer serverDataType) {
        this.serverDataType = serverDataType;
    }
}
