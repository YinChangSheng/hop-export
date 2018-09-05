package com.yangtuo.crm.domain.export.result;

import java.io.Serializable;

/**
 * @author qiyu
 * @date 2018/5/16
 */
public abstract class AbstractResult implements Serializable {

    private static final long serialVersionUID = 6159494279698012513L;


    public abstract Object getOrderByValue();

}
