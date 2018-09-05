package com.yangtuo.crm.domain.asAmount.form;

import java.io.Serializable;

/**
 * 用户-变化金额
 *
 * @author 栋
 * @create by 2018-05-28 上午8:20
 */
public class AsAmountForm implements Serializable{


    private String userId;

    private Long disposeAmount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getDisposeAmount() {
        return disposeAmount;
    }

    public void setDisposeAmount(Long disposeAmount) {
        this.disposeAmount = disposeAmount;
    }
}
