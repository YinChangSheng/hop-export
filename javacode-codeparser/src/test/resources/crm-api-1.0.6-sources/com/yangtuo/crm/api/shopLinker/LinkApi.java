package com.yangtuo.crm.api.shopLinker;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.shop.form.LinkerOptForm;
import com.yangtuo.crm.domain.shop.result.CrmLinkerTo;

import java.util.List;

/**
 * 联系人
 *
 * @author 木鸢
 * @create by 2018-04-11 15:54
 */
public interface LinkApi {

    /**
     * 添加联系人
     * @param linkerOptForm
     * @return
     */
    public ResultData<String> addLinker(LinkerOptForm linkerOptForm);

    /**
     * 修改联系人
     * @param linkerOptForm
     * @return
     */
    public ResultData<String> updateLinker(LinkerOptForm linkerOptForm);


    /**
     * 删除联系人
     * @param linkId
     * @param shopId
     * @return
     */
    public ResultData<String> deleteLinker(String linkId, String shopId);

    /**
     * 查询联系人
     *
     * @param objId
     * @return
     */
    ResultData<List<CrmLinkerTo>> getLinkerByObjId(String objId);
}
