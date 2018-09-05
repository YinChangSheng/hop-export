package com.ydonglai.hopexport.registry.webapi.hopapi;

import com.ydonglai.hopexport.registry.webapi.hopapi.dto.ApiForm;
import com.ydonglai.hopexport.registry.webapi.hopapi.dto.ApiListQuery;
import com.ydonglai.hopexport.registry.webapi.hopapi.dto.HopParam;

import java.util.List;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public interface HopApiHttpClient {

	HopWebResponse<List<HopParam>> apiList(ApiListQuery query);

	// HopWebResponse<> apiUpdate(ApiForm form);

}
