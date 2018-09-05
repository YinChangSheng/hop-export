package com.yangtuo.crm.api.visit.api;

import com.yangtuo.crm.api.visit.query.WorkVisitQuery;
import com.yangtuo.crm.api.visit.to.CrmVisitTO;
import com.yangtuo.crm.domain.ResultData;

import java.util.List;

/**
 *  拜访记录api接口
 * Created by muyu on 2017/4/14.
 */
public interface CrmVisitHistoryApi {

    /**
     * 工单-拜访关联记录 查询
     */
    ResultData<CrmVisitTO> queryWorkVisitRelationList(WorkVisitQuery workVistQuery);


    ResultData<Boolean> updateWorkRelation(String visitIds, String workId);

    /**
     * 工单已经拜访记录查询
     */
    ResultData<CrmVisitTO> querWorkVisitList(String workId, Integer pageSize, Integer pageNo);

}
