package com.yangtuo.crm.api.shopServerLog;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.shopServerLog.ShopServerLogForm;
import com.yangtuo.crm.domain.shopServerLog.ShopServerLogQuery;
import com.yangtuo.crm.domain.shopServerLog.ShopServerLogTO;

import java.util.List;

public interface ShopServerLogApi {

    ResultData<List<ShopServerLogTO>> queryShopServerLogList(ShopServerLogQuery shopServerLogQuery);

    ResultData<Boolean> insert(ShopServerLogForm shopServerLogForm);

    ResultData<Integer> insertBatch(List<ShopServerLogForm> shopServerLogForms);

}
