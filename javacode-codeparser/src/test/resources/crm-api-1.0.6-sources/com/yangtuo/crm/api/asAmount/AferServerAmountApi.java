package com.yangtuo.crm.api.asAmount;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.asAmount.form.AsAmountDetailForm;
import com.yangtuo.crm.domain.asAmount.form.AsAmountForm;
import com.yangtuo.crm.domain.asAmount.to.AsAmountDetailTO;
import com.yangtuo.crm.domain.asAmount.to.AsCouponTO;

import java.util.List;

/**
 * 服务人员发券
 *
 * @author 木鸢
 * @create by 2018-05-23 10:51
 */
public interface AferServerAmountApi {

    /**
     * 某服务人员余额和可发券列表
     * @param
     * @return
     */
    ResultData<AsCouponTO> getAsCouponList(String shopId);

    /**
     * 发券
     * @return
     */
    ResultData<Boolean> sendCoupon(String shopId, Integer couponType,  Long couponId);

    /**
     * 查询账户余额明细
     * @param form
     * @return
     */
    ResultData<List<AsAmountDetailTO>> queryAsAmountLog(AsAmountDetailForm form);

    /**
     * 批量修改账户余额(必须同一类型账户，否则导致业务异常)
     */
    ResultData<Boolean> batchUpdateAsAmount(Integer accountType,Integer optType, String remark,
                                            String operator,List<AsAmountForm> asAmountForms);
}
