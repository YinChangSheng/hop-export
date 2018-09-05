package com.yangtuo.crm.domain.worktask.form;


import java.io.Serializable;

/**
 * 工单提交审核表单
 *
 * @author kai.KingS
 * @create by 2018-05-02 下午5:28
 */
public class CheckForm implements Serializable {

    public static final int CheckTypeComplete = 1;

    public static final int CheckTypeTerminate = 2;

    private static final long serialVersionUID = 841819022062489970L;

    /**
     * 工单ID
     */
    private String workId;

    /**
     * 审核人处理方法
     *  1. 审核完成
     *  2. 终止
     */
    private Integer checkType;

    /**
     * 拜访记录审核结果(1. 优秀 2.良好 3.合格 4.不合格)
     */
    private Integer visitRecordCheck;

    /**
     * 图片审核结果
     * 图片审核(1. 优秀 2.良好 3.合格 4.不合格)
     */
    private Integer photoCheck;

    /**
     * 总体评价(1.优秀 2.良好 3.合格 4.不合格)
     */
    private Integer totalCheck;

    /**
     * 评价备注说明
     */
    private String remark;

    /**
     * 扣款金额
     */
    private Double fineMoney;


    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public Integer getVisitRecordCheck() {
        return visitRecordCheck;
    }

    public void setVisitRecordCheck(Integer visitRecordCheck) {
        this.visitRecordCheck = visitRecordCheck;
    }

    public Integer getPhotoCheck() {
        return photoCheck;
    }

    public void setPhotoCheck(Integer photoCheck) {
        this.photoCheck = photoCheck;
    }

    public Integer getTotalCheck() {
        return totalCheck;
    }

    public void setTotalCheck(Integer totalCheck) {
        this.totalCheck = totalCheck;
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

    public Integer getCheckType() {
        return checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }
}
