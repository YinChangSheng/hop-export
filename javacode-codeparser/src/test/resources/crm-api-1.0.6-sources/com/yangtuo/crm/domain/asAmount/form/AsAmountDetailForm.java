package com.yangtuo.crm.domain.asAmount.form;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.util.Date;

/**
 * @author 栋
 * @create by 2018-05-22 下午5:59
 */
public class AsAmountDetailForm extends CrmBaseQuery {

    /**
     * 查询开始日期
     */
    private Date  queryStartDate;
    /**
     * 查询结束日期
     */
    private Date queryEndDate;
    /**
     * 查询姓名
     */
    private String userRealName;

    public Date getQueryStartDate() {
        return queryStartDate;
    }

    public void setQueryStartDate(Date queryStartDate) {
        this.queryStartDate = queryStartDate;
    }

    public Date getQueryEndDate() {
        return queryEndDate;
    }

    public void setQueryEndDate(Date queryEndDate) {
        this.queryEndDate = queryEndDate;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
}
