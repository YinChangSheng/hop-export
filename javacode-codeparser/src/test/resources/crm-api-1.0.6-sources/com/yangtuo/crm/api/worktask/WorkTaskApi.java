package com.yangtuo.crm.api.worktask;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.worktask.form.CheckForm;
import com.yangtuo.crm.domain.worktask.query.WorkTaskQuery;
import com.yangtuo.crm.domain.worktask.to.CheckResultTO;
import com.yangtuo.crm.domain.worktask.to.WorkDetailTO;
import com.yangtuo.crm.domain.worktask.to.WorkTO;
import com.yangtuo.crm.domain.worktask.to.WorkTaskNumTO;
import com.yangtuo.crm.domain.worktask.to.*;

import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/25
 * 微信: yin80871901
 *
 * 工单接口
 */
public interface WorkTaskApi {

	/**
	 * 查询各类工单数量
	 * @return
	 */
	ResultData<WorkTaskNumTO> queryWorkTaskNum();

	/**
	 * 查询各类工单列表
	 * @param query
	 * @return
	 */
	ResultData<List<WorkTO>> queryWorkTaskList(WorkTaskQuery query);

	/**
	 * 获取工单详情
	 * 包括表单详情，下单门店(shopId), 触发订单(orderId)
	 * @return
	 */
	ResultData<WorkDetailTO> getWorkDetail(String workId,String taskId,String processInstanceId);


	/**
	 * 审查结果
	 * @param workId
	 * @return
	 */
	ResultData<CheckResultTO> getCheckResult(String workId);

	/**
	 * 查询工单的处理意见
	 * @param workId
	 * @return
	 */
	ResultData<List<WorkDealSuggestionTO>> queryWorkDealSuggestionList(String workId);


	/**
	 * 审核人提交审核
	 * @param form
	 * @return
	 */
	ResultData<String> checkResultCommit(CheckForm form);


	/**
	 * 处理人提交审核
	 * @param workId	工单ID
	 * @return
	 */
	ResultData<String> dealUserCommit(String workId);

}
