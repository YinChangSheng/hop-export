package com.yangtuo.crm.domain.task;

import java.io.Serializable;

/**
 * 任务中心状态数VO
 *
 * @author 景天
 * @create 2018-01-30 下午 1:42
 */
public class TaskStatusCountTO implements Serializable {

    /**
     * 状态key
     */
    private Integer code;
    /**
     * 状态描述
     */
    private String desc;
    /**
     * 对应状态的总数
     */
    private Integer count;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
