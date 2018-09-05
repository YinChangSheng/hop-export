package com.yangtuo.crm.api.visit.query;

import java.io.Serializable;

/**
 * 工作流拜访查询
 *
 * @author kai.KingS
 * @create by 2018-04-27 下午5:22
 */
public class WorkVisitQuery implements Serializable {

    private static final long serialVersionUID = 4711825231895898201L;

    /**
     *  工单编号
     */
    private String workId;

    /**
     * 门店ID
     */
    private String shopId;

    private Integer pageSize;

    private Integer pageNo;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
}
