package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 服务人员基本对象
 * @author 栋
 * create by2018-03-29 上午10:02
 */
public class BaseAfterServerTO implements Serializable{

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户姓名
     */
    private String userName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
