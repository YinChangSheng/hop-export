package com.ydonglai.hopexport.registry.webapi.hopapi.impl;

import com.ydonglai.hopexport.registry.webapi.hopapi.HopApiHttpClient;
import com.ydonglai.hopexport.registry.webapi.hopapi.HopWebApi;
import com.ydonglai.hopexport.registry.webapi.hopapi.HopWebResponse;
import com.ydonglai.hopexport.registry.webapi.hopapi.dto.ApiListQuery;
import com.ydonglai.hopexport.registry.webapi.hopapi.dto.HopParam;
import com.ydonglai.hopexport.registry.util.QueryUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;

import java.util.List;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
@Slf4j
public class DefaultHopApiHttpClient implements HopApiHttpClient {

	private final CloseableHttpClient httpClient;
	private final BasicCookieStore store;


	public DefaultHopApiHttpClient(CloseableHttpClient httpClient, BasicCookieStore store) {
		this.httpClient = httpClient;
		this.store = store;
	}

	void doRequest(HopWebApi webApi) {

	}

	@Override
	public HopWebResponse<List<HopParam>> apiList(ApiListQuery query) {
		QueryUtil.toEncodedUrl(query);
		// doRequest(HopWebApiSet.ApiQuery, );
		return null;
	}

//	@Override
//	public HopWebResponse apiUpdate(ApiForm form) {
//		return null;
//	}

}
