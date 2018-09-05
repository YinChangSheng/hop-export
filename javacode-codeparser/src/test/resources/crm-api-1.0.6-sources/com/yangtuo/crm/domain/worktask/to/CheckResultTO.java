package com.yangtuo.crm.domain.worktask.to;

import java.io.Serializable;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/27
 * 微信: yin80871901
 */
public class CheckResultTO implements Serializable {

	private static final long serialVersionUID = 840819022062489970L;

	/**
	 * 拜访记录审核结果(1. 优秀 2.良好 3.合格 4.不合格)
	 */
	private Integer visitRecordCheck;

	private String visitRecordCheckName;

	/**
	 * 图片审核结果
	 * 图片审核(1. 优秀 2.良好 3.合格 4.不合格)
	 */
	private Integer photoCheck;

	private String photoCheckName;

	/**
	 * 总体评价(1. 优秀 2.良好 3.合格 4.不合格)
	 */
	private Integer totalCheck;

	private String totalCheckName;

	/**
	 * 评价备注说明
	 */
	private String remark;

	/**
	 * 扣款金额
	 */
	private Double fineMoney;

	public Integer getVisitRecordCheck() {
		return visitRecordCheck;
	}

	public void setVisitRecordCheck(Integer visitRecordCheck) {
		this.visitRecordCheck = visitRecordCheck;
	}

	public String getVisitRecordCheckName() {
		return visitRecordCheckName;
	}

	public void setVisitRecordCheckName(String visitRecordCheckName) {
		this.visitRecordCheckName = visitRecordCheckName;
	}

	public Integer getPhotoCheck() {
		return photoCheck;
	}

	public void setPhotoCheck(Integer photoCheck) {
		this.photoCheck = photoCheck;
	}

	public String getPhotoCheckName() {
		return photoCheckName;
	}

	public void setPhotoCheckName(String photoCheckName) {
		this.photoCheckName = photoCheckName;
	}

	public Integer getTotalCheck() {
		return totalCheck;
	}

	public void setTotalCheck(Integer totalCheck) {
		this.totalCheck = totalCheck;
	}

	public String getTotalCheckName() {
		return totalCheckName;
	}

	public void setTotalCheckName(String totalCheckName) {
		this.totalCheckName = totalCheckName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getFineMoney() {
		return fineMoney;
	}

	public void setFineMoney(Double fineMoney) {
		this.fineMoney = fineMoney;
	}

}
