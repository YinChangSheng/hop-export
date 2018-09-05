package com.yangtuo.crm.domain.worktask.query;

import com.yangtuo.crm.domain.base.CrmBaseQuery;
import com.yangtuo.crm.domain.worktask.enums.ApplyUserEnum;
import com.yangtuo.crm.domain.worktask.enums.DealStatusEnum;
import com.yangtuo.crm.domain.worktask.enums.FormDealStatusEnum;
import com.yangtuo.crm.domain.worktask.enums.WorkStatusEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Objects;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/25
 * 微信: yin80871901
 */
public class WorkTaskQuery extends CrmBaseQuery {

	private static final long serialVersionUID = -8756122735581110560L;

	private String workNoOrWorkName;

	private String orderByTime;

	/**
	 * 处理状态
	 */
	private String filterParams1;

	/**
	 * 发起人
	 */
	private String filterParams2;

	/**
	 * 工单状态
	 */
	private String filterParams3;

	/**
	 * 按照 queryParams 的规则填充对象
	 * @return
	 */
	public WorkTaskQuery fillFilterParamsToBean() throws NumberFormatException {

		if ( StringUtils.isNoneBlank(filterParams1) ) {
			String[] params = filterParams1.split(",");
			Arrays.stream(params).map(s -> FormDealStatusEnum.codeOf(Integer.valueOf(params[0]))).forEach(s -> {
				if ( Objects.equals(FormDealStatusEnum.HAVE_DEAL, s) ) {
					withProcessed = 1;
				}
				if ( Objects.equals(FormDealStatusEnum.WAITE_DEAL, s) ) {
					withPending = 1;
				}
			});
		}

		if ( StringUtils.isNoneBlank(filterParams2) ) {
			String[] params = filterParams2.split(",");
			Arrays.stream(params).map(s -> ApplyUserEnum.codeOf(Integer.valueOf(params[0]))).forEach(s -> {
				if ( Objects.equals(ApplyUserEnum.WITH_ME, s) ) {
					withMeApply = 1;
				}
				if ( Objects.equals(ApplyUserEnum.WITH_OTHER, s) ) {
					withOtherApply = 1;
				}
			});
		}

		if ( StringUtils.isNoneBlank(filterParams3) ) {
			String[] params = filterParams3.split(",");
			Arrays.stream(params).map(s -> WorkStatusEnum.codeOf(Integer.valueOf(params[0]))).forEach(s -> {
				if ( Objects.equals(WorkStatusEnum.PROCESSING, s) ) {
					withProcessing = 1;
				}
				if ( Objects.equals(WorkStatusEnum.TERMINATE, s) ) {
					withTerminate = 1;
				}
				if ( Objects.equals(WorkStatusEnum.COMPLETE, s) ) {
					withCompleted = 1;
				}
			});
		}

		return this;
	}

	public String getWorkNoOrWorkName() {
		return workNoOrWorkName;
	}

	public void setWorkNoOrWorkName(String workNoOrWorkName) {
		this.workNoOrWorkName = workNoOrWorkName;
	}

	public String getOrderByTime() {
		return orderByTime;
	}

	public void setOrderByTime(String orderByTime) {
		this.orderByTime = orderByTime;
	}

	public String getFilterParams1() {
		return filterParams1;
	}

	public void setFilterParams1(String filterParams1) {
		this.filterParams1 = filterParams1;
	}

	public String getFilterParams2() {
		return filterParams2;
	}

	public void setFilterParams2(String filterParams2) {
		this.filterParams2 = filterParams2;
	}

	public String getFilterParams3() {
		return filterParams3;
	}

	public void setFilterParams3(String filterParams3) {
		this.filterParams3 = filterParams3;
	}

	/**
	 * 查询待处理的
	 */
	private Integer withPending;

	/**
	 * 查询已处理的
	 */
	private Integer withProcessed;

	/**
	 * 我发起的
	 */
	private Integer withMeApply;

	/**
	 * 他人发起的
	 */
	private Integer withOtherApply;

	/**
	 * 进行中的
	 */
	private Integer withProcessing;

	/**
	 * 已终止的
	 */
	private Integer withTerminate;

	/**
	 * 已完成的
	 */
	private Integer withCompleted;

	/**
	 * 查询结果按照发起时间排序
	 * 0 asc, 1 desc
	 */
	private String startTimeOrderBy;

	public Integer getWithPending() {
		return withPending;
	}

	public void setWithPending(Integer withPending) {
		this.withPending = withPending;
	}

	public Integer getWithProcessed() {
		return withProcessed;
	}

	public void setWithProcessed(Integer withProcessed) {
		this.withProcessed = withProcessed;
	}

	public Integer getWithMeApply() {
		return withMeApply;
	}

	public void setWithMeApply(Integer withMeApply) {
		this.withMeApply = withMeApply;
	}

	public Integer getWithOtherApply() {
		return withOtherApply;
	}

	public void setWithOtherApply(Integer withOtherApply) {
		this.withOtherApply = withOtherApply;
	}

	public Integer getWithProcessing() {
		return withProcessing;
	}

	public void setWithProcessing(Integer withProcessing) {
		this.withProcessing = withProcessing;
	}

	public Integer getWithTerminate() {
		return withTerminate;
	}

	public void setWithTerminate(Integer withTerminate) {
		this.withTerminate = withTerminate;
	}

	public String getStartTimeOrderBy() {
		return startTimeOrderBy;
	}

	public void setStartTimeOrderBy(String startTimeOrderBy) {
		this.startTimeOrderBy = startTimeOrderBy;
	}

	public Integer getWithCompleted() {
		return withCompleted;
	}

	public void setWithCompleted(Integer withCompleted) {
		this.withCompleted = withCompleted;
	}

}
