package com.yangtuo.crm.domain.worktask.to;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/25
 * 微信: yin80871901
 * 工单对象
 */
public class WorkTO implements Serializable {

	private static final long serialVersionUID = 1221874173074312156L;

	public WorkTO() {
	}

	public WorkTO(int statusCode, String statusName, String applyUserName, Date startTime, String businessNum, String businessName, String currentTaskName, String currentTaskId) {
		this.statusCode = statusCode;
		this.statusName = statusName;
		this.applyUserName = applyUserName;
		this.startTime = startTime;
		this.businessNum = businessNum;
		this.businessName = businessName;
		this.currentTaskName = currentTaskName;
		this.currentTaskId = currentTaskId;
	}

	private String workId;

	/**
	 * 工单状态码
	 * ProcessTO 中没有工单的状态
	 * 是通过一些字段是否有值来判断
	 * 当 startTime , endTime
	 */
	private int statusCode;

	/**
	 * 工单状态名
	 * 1: 进行中, 2: 已完成, 3: 已终止
	 */
	private String statusName;

	/**
	 * 发起人全名称
	 */
	private String applyUserName;

	/**
	 * 工单 发起时间
	 */
	private Date startTime;

	private String startTimeText;

	/**
	 * 工单编号
	 */
	private String businessNum;

	/**
	 * 工单业务名称
	 * 例如 销售拜访，原服务人员确认，申请主管审批
	 */
	private String businessName;

	/**
	 * 当前工单任务节点名称
	 */
	private String currentTaskName;

	/**
	 * 当前工单状态节点ID
	 */
	private String currentTaskId;

	/**
	 * 流程实例ID
	 */
	private String processInstanceId;

	/**
	 * 列表->详情 发起人显示
	 */
	private String applyDetailInfo;

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public String getStartTimeText() {
		return startTimeText;
	}

	public void setStartTimeText(String startTimeText) {
		this.startTimeText = startTimeText;
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getApplyUserName() {
		return applyUserName;
	}

	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public String getCurrentTaskId() {
		return currentTaskId;
	}

	public void setCurrentTaskId(String currentTaskId) {
		this.currentTaskId = currentTaskId;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getBusinessNum() {
		return businessNum;
	}

	public void setBusinessNum(String businessNum) {
		this.businessNum = businessNum;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getCurrentTaskName() {
		return currentTaskName;
	}

	public void setCurrentTaskName(String currentTaskName) {
		this.currentTaskName = currentTaskName;
	}

	public String getApplyDetailInfo() {
		return applyDetailInfo;
	}

	public void setApplyDetailInfo(String applyDetailInfo) {
		this.applyDetailInfo = applyDetailInfo;
	}
}
