package com.yangtuo.crm.api.workTable;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.task.TaskStatusCountTO;
import com.yangtuo.crm.domain.workTable.to.AfterServerGmvTO;
import com.yangtuo.crm.domain.workTable.to.TaskPlanCountByPeriodTO;
import java.util.List;

public interface WorkTableApi {

    ResultData<List<TaskPlanCountByPeriodTO>> queryContactPlanCountByPeriod(String startDate, String endDate);

    ResultData<List<TaskStatusCountTO>> queryTaskCount();

    ResultData<List<AfterServerGmvTO>> getTodayGmv(Integer rankingType);

    ResultData<List<AfterServerGmvTO>> getMonthGmv(Integer rankingType);

}
