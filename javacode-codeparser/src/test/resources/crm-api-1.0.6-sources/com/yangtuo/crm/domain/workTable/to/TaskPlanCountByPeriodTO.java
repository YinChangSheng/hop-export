package com.yangtuo.crm.domain.workTable.to;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 栋
 * @create by 2018-04-17 上午9:46
 */
public class TaskPlanCountByPeriodTO implements Serializable {

    private String today;

    private Integer count;

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
