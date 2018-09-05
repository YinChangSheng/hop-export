package com.yangtuo.crm.domain.asAmount.to;

import java.io.Serializable;
import java.util.List;

/**
 * 服务人员余额账户和对应券
 *
 * @author 木鸢
 *         create by 2018-05-23 16:21
 */
public class AsCouponTO implements Serializable {

    private static final long serialVersionUID = -8136309312933336239L;

    /**
     * 门店类型
     */
    private Integer storeType;

    //账户余额-优惠券
    private List<AsAccountTO> asAccounts;

    public List<AsAccountTO> getAsAccounts() {
        return asAccounts;
    }

    public void setAsAccounts(List<AsAccountTO> asAccounts) {
        this.asAccounts = asAccounts;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }
}
