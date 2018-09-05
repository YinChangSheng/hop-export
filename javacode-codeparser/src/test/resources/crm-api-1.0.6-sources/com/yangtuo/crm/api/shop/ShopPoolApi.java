package com.yangtuo.crm.api.shop;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.shop.result.BaseAfterServerTO;
import com.yangtuo.crm.domain.shop.result.ShopCapacityTO;
import com.yangtuo.crm.domain.shop.result.ShopServerTo;

import java.util.List;

/**
 * 门店服务人员查询
 * @author  muyu 2018.4.16
 */
public interface ShopPoolApi {
    /**
     * 查询门店服务人员
     * @param shopId
     * @return
     */
    ResultData<List<ShopServerTo>> findServiceByShopId(String shopId);

    /**
     * 批量修改门店服务人员
     * @param serverUserId 如shop_pool_group_1:${userId1};shop_pool_group_2:${userId2}，若userId为0，表示清空该类型的服务人员
     * @param shopIds 多个门店id，"，"分隔
     * @return
     */
    ResultData<Boolean> batchUpdateShopServer(String serverUserId,String shopIds,Integer reason,String remark);

    /**
     * 批量删除服务人员
     * @param shopPoolList  shop_pool_group_1
     * @param shopIds       门店id, 多个门","分隔
     * @param remark
     * @return
     */
    ResultData<Boolean> batchRemoveShopServer(String shopPoolList,String shopIds, Integer reason,String remark);

    /**
     * 获得服务人员限容大小与当前服务门店数大小
     * @param userId 服务人员
     * @return
     */
    ResultData<ShopCapacityTO> getCapacity(String userId);

    /**
     * 获得所有服务人员（销售部、在线运营部、品牌运营部）
     * @return
     */
    ResultData<List<BaseAfterServerTO>> getAfterServerList();

    /**
     * 批量修改、清空服务人员工具
     * @param shopIds 门店id集合
     * @param userId 分配人 （清空时，此参数不传）
     * @param afterServerType 修改的服务人员类型
     * @return
     */
    ResultData<Boolean> batchModifyAfterServer(String shopIds,String userId,String afterServerType,Integer reason,String remark);

}
