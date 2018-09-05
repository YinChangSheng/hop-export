package com.yangtuo.crm.api.activity;

import com.yangtuo.crm.domain.ResultData;

public interface PcSpActivityApi {

    /**
     * 获得通货行情列表
     * @param activityType
     * @param proId
     * @param cityId
     * @return
     */
    ResultData getActivity(Integer activityType, String proId, String cityId);

    /**
     * 获得通货行情详情
     * @param activityType
     * @param storeyId
     * @param proId
     * @param cityId
     * @return
     */
    ResultData getActivityStorey(Integer activityType,Long storeyId,String proId,String cityId);

}
