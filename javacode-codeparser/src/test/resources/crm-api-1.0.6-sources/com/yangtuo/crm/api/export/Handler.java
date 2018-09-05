package com.yangtuo.crm.api.export;

import com.yangtuo.crm.domain.ResultData;

import java.util.List;

/**
 * @author qiyu
 * @date 2018/5/17
 */
public interface Handler<V> {

    /**
     * 处理全量查询是每次分页查询的结果处理
     *
     * @param list
     * @return
     */
    ResultData handle(List<V> list);
}
