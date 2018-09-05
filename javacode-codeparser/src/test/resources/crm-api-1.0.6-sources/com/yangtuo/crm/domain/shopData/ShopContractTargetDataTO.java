package com.yangtuo.crm.domain.shopData;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Created by diandian on 2018/5/17.
 */
public class ShopContractTargetDataTO implements Serializable {

    private static final long serialVersionUID = 1L;
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
     * 合同内关联门店信息<shopId,shopName>
     */
    private List<Map<String,String>> contractShopMaps;
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
     * 合同A类目标完成百分比
     */
    private String targetAFinishPercent;
    /**
     * 合同B类目标完成百分比
     */
    private String targetBFinishPercent;

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

    public List<Map<String, String>> getContractShopMaps() {
        return contractShopMaps;
    }

    public void setContractShopMaps(List<Map<String, String>> contractShopMaps) {
        this.contractShopMaps = contractShopMaps;
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

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
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

    public String getTargetAFinishPercent() {
        return targetAFinishPercent;
    }

    public void setTargetAFinishPercent(String targetAFinishPercent) {
        this.targetAFinishPercent = targetAFinishPercent;
    }

    public String getTargetBFinishPercent() {
        return targetBFinishPercent;
    }

    public void setTargetBFinishPercent(String targetBFinishPercent) {
        this.targetBFinishPercent = targetBFinishPercent;
    }
}
