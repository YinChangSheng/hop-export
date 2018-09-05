package com.yangtuo.crm.api.common;

import com.yangtuo.crm.domain.CrmAreaTO;
import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.base.BaseTreeNode;

import java.util.List;

/**
 * 区域查询接口
 *
 * @author muyu
 */
public interface AreaApi {

    /**
     * 加载区域树
     * @return
     */
    ResultData<List<BaseTreeNode<CrmAreaTO>>> getAreaTree();

    /**
     *
     */
    ResultData<CrmAreaTO> getAreaById(String id);

    /**
     * 查询下级区域列表
     * @param parentId
     * @return
     */
    ResultData<List<CrmAreaTO>> findAreaByParent(String parentId);
}
