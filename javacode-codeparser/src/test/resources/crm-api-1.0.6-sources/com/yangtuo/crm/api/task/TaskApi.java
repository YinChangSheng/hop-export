package com.yangtuo.crm.api.task;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.task.TaskCenterQuery;
import com.yangtuo.crm.domain.task.TaskCenterTO;
import com.yangtuo.crm.domain.task.TaskStatusCountTO;

import java.util.List;

public interface TaskApi {

    /**
     * 列表查询
     * @param taskCenterQuery
     * @return
     */
    ResultData<List<TaskCenterTO>> taskData(TaskCenterQuery taskCenterQuery);

    /**
     * 任务中心状态数量
     * @return
     */
    ResultData<List<TaskStatusCountTO>> taskCount();

    /**
     * 修改任务状态
     * @param taskStatus
     * @return
     */
    ResultData<Boolean> updateStatus(Integer taskStatus, String processContent, String taskIds);

}
