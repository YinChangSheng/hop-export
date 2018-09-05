package com.yangtuo.crm.domain.worktask.to;

import java.io.Serializable;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/25
 * 微信: yin80871901
 */
public class WorkTaskNumTO implements Serializable {

	private static final long serialVersionUID = 2126293289934605950L;

	/**
	 * 发起进行中的数量
	 */
	private Integer processingNum;

	/**
	 * 待处理的工单数量
	 */
	private Integer pendingNum;

	public Integer getProcessingNum() {
		return processingNum;
	}

	public void setProcessingNum(Integer processingNum) {
		this.processingNum = processingNum;
	}

	public Integer getPendingNum() {
		return pendingNum ;
	}

	public void setPendingNum(Integer pendingNum) {
		this.pendingNum = pendingNum;
	}

}
