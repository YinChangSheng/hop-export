/**
 * www.hipac.cn Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yangtuo.crm.domain.base;

import org.apache.commons.lang3.builder.ToStringBuilder;
import java.io.Serializable;

/**
 * <p>CrmBaseQuery</p>
 *
 * @author jingtian
 * @version $Id: CrmBaseQuery.java, v 0.1 2018-04-03下午17:22:49 jingtian Exp $
 */
public class CrmBaseQuery implements Serializable {

    private int pageNo = 1;

    private int pageSize = 10;

    private Integer isDeleted;

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
