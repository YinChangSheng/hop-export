package com.yangtuo.crm.domain.task;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

/**
 * 任务中心查询对象
 *
 * @migration com.hipac.biz.taskCenter.domain.query.CrmTaskQuery
 * @author 景天
 * @create 2018-01-26 上午 10:20
 */
public class TaskCenterQuery extends CrmBaseQuery{

    /**
     * 任务状态(1,待处理 2,处理中 3,已处理)
     */
    private Integer taskStatus;

    /**
     * 代办处理人
     */
    private String dealUser;

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getDealUser() {
        return dealUser;
    }

    public void setDealUser(String dealUser) {
        this.dealUser = dealUser;
    }
}
