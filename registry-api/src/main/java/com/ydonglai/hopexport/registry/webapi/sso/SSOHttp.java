package com.ydonglai.hopexport.registry.webapi.sso;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import java.io.IOException;
import java.util.Map;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/29
 */
public interface SSOHttp {

	Map<String, Object> doJsonp(HttpGet httpGet) throws IOException;

	HttpEntity doRequest(HttpUriRequest httpPost) throws IOException;

}
