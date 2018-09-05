package com.yangtuo.crm.domain.workTable.to;

import java.io.Serializable;

/**
 * @author 栋
 * @create by 2018-01-17 14:19
 */
public class AfterServerGmvTO implements Serializable{

    /**
     * 服务人员名字
     */
    private String userName;

    /**
     *服务人员全部Gmv
     */
    private long allGmv;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getAllGmv() {
        return allGmv;
    }

    public void setAllGmv(long allGmv) {
        this.allGmv = allGmv;
    }
}
