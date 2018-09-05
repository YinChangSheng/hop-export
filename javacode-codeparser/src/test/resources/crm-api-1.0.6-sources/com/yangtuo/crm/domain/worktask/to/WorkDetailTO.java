package com.yangtuo.crm.domain.worktask.to;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/27
 * 微信: yin80871901
 * 工单详情接口
 */
public class WorkDetailTO implements Serializable {

	private static final long serialVersionUID = 175163851312605950L;

	/**
	 * 工单标题
	 */
	private String workName;

	private String deptName;


	/**
	 * 工单编号
	 */
	private String workId;

	/**
	 * 工单发起人-全名称
	 */
	private String dealFullUserName;

	/**
	 * 发起人名称
	 */
	private String applyUserName;

	/**
	 * 部门名称
	 */
	private String departmentName;

	/**
	 * 发起时间
	 */
	private Date startTime;

	private String startTimeText;

	/**
	 * 工单截止日期
	 */
	private Date endTime;

	private String endTimeText;

	/**
	 * 1, 2, 3
	 */
	private Integer nodeStatus;

	/**
	 *(1.待处理 2.已处理 3.超时自动处理)
	 */
	private String nodeStatusName;

	/**
	 * 例如: 销售拜访(张三丰)
	 * 当前节点状态
	 */
	private String nodeUserName;

	/**
	 * 下单门店ID
	 */
	private String shopId;

	/**
	 * 触发订单ID
	 */
	private String orderId;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 编辑模式
	 * 1 : 受理人可写 2: 审核人可写 3: 只能查看
	 */
	private Integer editMode;

	/**
	 * 流程摘要
	 */
	private String flowDesc;

	private String dealUserRemark;

	public String getFlowDesc() {
		return flowDesc;
	}

	public String getDealUserRemark() {
		return dealUserRemark;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDealUserRemark(String dealRemark) {
		this.dealUserRemark = dealRemark;
	}

	public void setFlowDesc(String flowDesc) {
		this.flowDesc = flowDesc;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Integer getEditMode() {
		return editMode;
	}

	public void setEditMode(Integer editMode) {
		this.editMode = editMode;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getDealFullUserName() {
		return dealFullUserName;
	}

	public void setDealFullUserName(String dealFullUserName) {
		this.dealFullUserName = dealFullUserName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Integer getNodeStatus() {
		return nodeStatus;
	}

	public void setNodeStatus(Integer nodeStatus) {
		this.nodeStatus = nodeStatus;
	}

	public String getNodeStatusName() {
		return nodeStatusName;
	}

	public void setNodeStatusName(String nodeStatusName) {
		this.nodeStatusName = nodeStatusName;
	}

	public String getNodeUserName() {
		return nodeUserName;
	}

	public void setNodeUserName(String nodeUserName) {
		this.nodeUserName = nodeUserName;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStartTimeText() {
		return startTimeText;
	}

	public void setStartTimeText(String startTimeText) {
		this.startTimeText = startTimeText;
	}

	public String getEndTimeText() {
		return endTimeText;
	}

	public void setEndTimeText(String endTimeText) {
		this.endTimeText = endTimeText;
	}

	public String getApplyUserName() {
		return applyUserName;
	}

	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
