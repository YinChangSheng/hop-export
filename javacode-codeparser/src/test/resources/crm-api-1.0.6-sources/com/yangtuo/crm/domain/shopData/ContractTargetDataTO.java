package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Created by diandian on 2018/5/17.
 */
public class ContractTargetDataTO implements Serializable {

    /**
     * 任务类型 （仅B类，AB类）
     */
    private Integer targetType;
    /**
     * 合同A类目标
     */
    private Long targetA;
    /**
     * 合同B类目标
     */
    private Long targetB;
    /**
     * 合同A类目标完成值
     */
    private Double targetAFinish;
    /**
     * 合同B类目标完成值
     */
    private Double targetBFinish;
    /**
     * 该门店A类目标完成值
     */
    private Double thisShopTargetAFinish;
    /**
     * 该门店B类目标完成值
     */
    private Double thisShopTargetBFinish;
    /**
     * 合同生效时间
     */
    private String startTime;

    /**
     * 合同结束时间
     */
    private String endTime;

    private boolean isFinish;

    public Integer getTargetType() {
        return targetType;
    }

    public void setTargetType(Integer targetType) {
        this.targetType = targetType;
    }

    public Long getTargetA() {
        return targetA;
    }

    public void setTargetA(Long targetA) {
        this.targetA = targetA;
    }

    public Long getTargetB() {
        return targetB;
    }

    public void setTargetB(Long targetB) {
        this.targetB = targetB;
    }

    public Double getTargetAFinish() {
        return targetAFinish;
    }

    public void setTargetAFinish(Double targetAFinish) {
        this.targetAFinish = targetAFinish;
    }

    public Double getTargetBFinish() {
        return targetBFinish;
    }

    public void setTargetBFinish(Double targetBFinish) {
        this.targetBFinish = targetBFinish;
    }

    public Double getThisShopTargetAFinish() {
        return thisShopTargetAFinish;
    }

    public void setThisShopTargetAFinish(Double thisShopTargetAFinish) {
        this.thisShopTargetAFinish = thisShopTargetAFinish;
    }

    public Double getThisShopTargetBFinish() {
        return thisShopTargetBFinish;
    }

    public void setThisShopTargetBFinish(Double thisShopTargetBFinish) {
        this.thisShopTargetBFinish = thisShopTargetBFinish;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
