package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;

/**
 * @author Created by diandian on 2018/5/16.
 */
public class ShopBTypeDataTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String thisYearGmv;

    private String thisMonthGmv;

    private String lastMonthGmv;

    private String rate;

    public String getThisYearGmv() {
        return thisYearGmv;
    }

    public void setThisYearGmv(String thisYearGmv) {
        this.thisYearGmv = thisYearGmv;
    }

    public String getThisMonthGmv() {
        return thisMonthGmv;
    }

    public void setThisMonthGmv(String thisMonthGmv) {
        this.thisMonthGmv = thisMonthGmv;
    }

    public String getLastMonthGmv() {
        return lastMonthGmv;
    }

    public void setLastMonthGmv(String lastMonthGmv) {
        this.lastMonthGmv = lastMonthGmv;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
