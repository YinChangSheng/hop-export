package com.yangtuo.crm.domain.publicsea.query;

import com.yangtuo.crm.domain.shop.form.ShopQueryForm;

import java.io.Serializable;
import java.util.Date;

/**
 * 公海查询对象
 *
 * @author kai.KingS
 * @create by 2018-06-06 下午8:28
 */
public class PublicSeaShopQuery extends ShopQueryForm implements Serializable {

    private static final long serialVersionUID = 2918020601196545673L;

    /**
     * 入公海 查询起始时间
     */
    private Date inputSeaTimeStart;

    /**
     * 入公海 查询结束时间
     */
    private Date inputSeaTimeEnd;

    /**
     * 入公海 原因
     */
    private Integer insertReason;

    /**
     * 公海类型
     */
    private Integer publicSeaType;

    public Date getInputSeaTimeStart() {
        return inputSeaTimeStart;
    }

    public void setInputSeaTimeStart(Date inputSeaTimeStart) {
        this.inputSeaTimeStart = inputSeaTimeStart;
    }

    public Date getInputSeaTimeEnd() {
        return inputSeaTimeEnd;
    }

    public void setInputSeaTimeEnd(Date inputSeaTimeEnd) {
        this.inputSeaTimeEnd = inputSeaTimeEnd;
    }

    public Integer getInsertReason() {
        return insertReason;
    }

    public void setInsertReason(Integer insertReason) {
        this.insertReason = insertReason;
    }

    public Integer getPublicSeaType() {
        return publicSeaType;
    }

    public void setPublicSeaType(Integer publicSeaType) {
        this.publicSeaType = publicSeaType;
    }
}
