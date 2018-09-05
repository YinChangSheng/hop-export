package com.yangtuo.crm.api.duplicate;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.duplicate.DuplicateQueryForm;
import com.yangtuo.crm.domain.duplicate.ShopRepeatTO;

import java.util.List;

/**
 * @author Created by diandian on 2018/4/12.
 */
public interface DuplicateApi {

    /**
     * 查重控件
     * @param duplicateQueryForm
     * @return
     */
    ResultData<List<ShopRepeatTO>> duplicateWidget(DuplicateQueryForm duplicateQueryForm);

}
