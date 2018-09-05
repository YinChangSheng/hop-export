package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;
import java.util.List;

/**
 * 查询条件初始化数据封装
 *
 * @author 木鸢
 * create by2018-04-03 10:50
 */
public class ShopQueryConditionRetTo implements Serializable {

    private static final long serialVersionUID = -8136309312949536239L;


    /**
     * 门店等级
     */
    List<Pair> shopGrowingUpLevelList;

    /**
     * 活跃度
     * @return
     */
    List<Pair> shopOrderFrequencyList;


    /**
     * 资质审核
     */
    List<Pair>approveStatusList;

    /**
     * 账号类型(单体/连锁)
     * @return
     */
    List<Pair> shopTypeList;

    /**
     * 门店类型
     */
    List<Pair> storeTypeList;

    /**
     * 合作类型
     */
    List<Pair>ShopGradeList;


    public List<Pair> getShopGradeList() {
        return ShopGradeList;
    }

    public void setShopGradeList(List<Pair> shopGradeList) {
        ShopGradeList = shopGradeList;
    }

    public List<Pair> getShopGrowingUpLevelList() {
        return shopGrowingUpLevelList;
    }

    public void setShopGrowingUpLevelList(List<Pair> shopGrowingUpLevelList) {
        this.shopGrowingUpLevelList = shopGrowingUpLevelList;
    }

    public List<Pair> getShopOrderFrequencyList() {
        return shopOrderFrequencyList;
    }

    public void setShopOrderFrequencyList(List<Pair> shopOrderFrequencyList) {
        this.shopOrderFrequencyList = shopOrderFrequencyList;
    }

    public List<Pair> getApproveStatusList() {
        return approveStatusList;
    }

    public void setApproveStatusList(List<Pair> approveStatusList) {
        this.approveStatusList = approveStatusList;
    }

    public List<Pair> getStoreTypeList() {
        return storeTypeList;
    }

    public void setStoreTypeList(List<Pair> storeTypeList) {
        this.storeTypeList = storeTypeList;
    }

    public List<Pair> getShopTypeList() {
        return shopTypeList;
    }

    public void setShopTypeList(List<Pair> shopTypeList) {
        this.shopTypeList = shopTypeList;
    }
}
