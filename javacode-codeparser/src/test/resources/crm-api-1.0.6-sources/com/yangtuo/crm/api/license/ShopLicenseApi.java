package com.yangtuo.crm.api.license;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.license.ApproveLogTO;
import com.yangtuo.crm.domain.license.CrmLicenseTO;
import com.yangtuo.crm.domain.shop.query.ShopLicenseQuery;
import com.yangtuo.crm.domain.shop.result.CrmShopLicenseTO;
import com.yangtuo.crm.domain.shop.result.ShopQualificationTo;

import java.util.List;
import java.util.Map;

/**
 * 门店营业执照资质接口
 * @author muyu
 */
public interface ShopLicenseApi {

    /**
     * 审核营业执照
     */
    ResultData<ShopQualificationTo> auditLicense(String shopId, Integer approveType, String content);

    /**
     * 查看营业执照信息
     * @param shopId
     */
    ResultData<CrmLicenseTO> getShopLicense(String shopId);

    /**
     * 查看营业执照审核记录列表
      */
    ResultData<List<ApproveLogTO>> findApproveLogs(String shopId);

    /**
     * 无资质审核
     *
     * @param shopId 门店ID
     * @param type   无资质原因
     * @param desc   原因详情描述
     * @return 返回门店信息列表数据，同“auditLicense”返回
     */
    ResultData<ShopQualificationTo> applyNoneLicenseAudit(String shopId, Integer type, String desc);

    /**
     * 门店资质审核：系统审核
     *
     * @return 处理提示消息
     */
    ResultData<?> systemAudit();

    /**
     * 查询门店认证
     * @return
     */
    ResultData<List<CrmShopLicenseTO>> queryShopLicenseList(ShopLicenseQuery licenseQuery);

    /**
     * 查询
     * 各种类型
     * 门店认证
     * 数量
     * @return
     */
    ResultData<Map<Integer, Long>> queryShopLicenseNums(ShopLicenseQuery licenseQuery);

}
