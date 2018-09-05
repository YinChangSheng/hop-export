package com.yangtuo.crm.api.report;


import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.report.ServerDataQuery;
import com.yangtuo.crm.domain.report.ShopDataSurveyTO;
import com.yangtuo.crm.domain.shopData.ContractTargetDataTO;
import com.yangtuo.crm.domain.shopData.ShopBTypeBrandDataTO;
import com.yangtuo.crm.domain.shopData.ShopBTypeCategoryDataTO;
import com.yangtuo.crm.domain.shopData.ShopBTypeDataTO;
import com.yangtuo.crm.domain.shopData.ShopBrowseTopBrandDataTO;
import com.yangtuo.crm.domain.shopData.ShopContractTargetDataTO;
import com.yangtuo.crm.domain.shopData.ShopOrderTopBrandDataTO;
import com.yangtuo.crm.domain.shopData.ShopOrderTopCategoryDataTO;

import java.util.List;

/**
 * Created by huqiang on 16/8/10.
 */
public interface CrmDataApi {

    /**
     * 查询下属数据
     * @param serverDataQuery
     * @return
     */
    ResultData<List<ShopDataSurveyTO>> queryServerData(ServerDataQuery serverDataQuery);

    /**
     * 查询门店TOP浏览品牌
     * @param shopId
     * @return
     */
    ResultData<List<ShopBrowseTopBrandDataTO>> getShopBrowseTopBrandData(String shopId);

    /**
     * 门店B类品牌数据
     * @param ShopId
     * @return
     */
    ResultData<List<ShopBTypeBrandDataTO>> getShopBTypeBrandData(String ShopId,Integer rank);

    /**
     * 查询门店B类类目数据
     * @param shopId
     * @return
     */
    ResultData<List<ShopBTypeCategoryDataTO>> getShopBTypeCategoryData(String shopId,Integer rank);

    /**
     * 查询门店B类数据概览
     * @param shopId
     * @return
     */
    ResultData<ShopBTypeDataTO> getShopBTypeData(String shopId);

    /**
     * 查询门店TOP下单品牌
     * @param shopId
     * @return
     */
    ResultData<List<ShopOrderTopBrandDataTO>> getShopOrderTopBrandData(String shopId,Integer rank);

    /**
     * 查询门店TOP下单类目数据
     * @param shopId
     * @return
     */
    ResultData<List<ShopOrderTopCategoryDataTO>> getShopOrderTopCategoryData(String shopId,Integer rank);

    /**
     * crmapp查询门店家人计划完成进度
     * @param shopId
     * @return
     */
    ResultData<ShopContractTargetDataTO> getShopContractTargetData(String shopId);

    /**
     * mallapp查询门店家人计划完成进度
     * @return
     */
    ResultData<ContractTargetDataTO> getShopContractTargetDataForMall();

    /**
     * mallapp查询门店B类类目数据
     * @param rank
     * @return
     */
    ResultData<List<ShopBTypeCategoryDataTO>> getShopBTypeCategoryDataForMall(Integer rank);

    /**
     * mallapp查询门店B类品牌数据
     * @param rank
     * @return
     */
    ResultData<List<ShopBTypeBrandDataTO>> getShopBTypeBrandDataForMall(Integer rank);

    /**
     * mallapp查询门店B类数据概览
     * @return
     */
    ResultData<ShopBTypeDataTO> getShopBTypeDataForMall();
}
