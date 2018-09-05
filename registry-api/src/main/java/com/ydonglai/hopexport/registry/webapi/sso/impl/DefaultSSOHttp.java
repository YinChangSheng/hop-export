package com.ydonglai.hopexport.registry.webapi.sso.impl;

import com.alibaba.fastjson.JSONObject;
import com.ydonglai.hopexport.registry.webapi.sso.SSOException;
import com.ydonglai.hopexport.registry.webapi.sso.SSOHttp;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/29
 */
@Slf4j
public class DefaultSSOHttp implements SSOHttp {

	private CloseableHttpClient httpClient;

	protected static final String JSONP_CALLBACK_NAME = "callback";

	protected static final String JSONP_CALLBACK_VALUE = "_callback";

	protected static final Charset UTF8 = Charset.forName("UTF-8");

	private HttpHost baseUrl;

	private String streamToString(InputStream inputStream) throws IOException {
		final int bufferSize = 1024;
		final char[] buffer = new char[bufferSize];
		final StringBuilder out = new StringBuilder();
		Reader in = new InputStreamReader(inputStream, "UTF-8");
		for (; ; ) {
			int rsz = in.read(buffer, 0, buffer.length);
			if (rsz < 0)
				break;
			out.append(buffer, 0, rsz);
		}
		return out.toString();
	}

	public DefaultSSOHttp(String baseUrl, CloseableHttpClient httpClient) {
		this.httpClient = httpClient;
		this.baseUrl = HttpHost.create(baseUrl);
	}

	@Override
	public Map<String, Object> doJsonp(HttpGet httpGet) throws IOException {

		URI uri = httpGet.getURI();
		List<NameValuePair> valuePairs = URLEncodedUtils.parse(uri.getQuery(), UTF8);
		List<NameValuePair> newValuePairs = new ArrayList<>();

		// 过略掉已添加的 callback，并添加新的 callback
		for ( NameValuePair pair : valuePairs ) {
			if ( ! JSONP_CALLBACK_NAME.equals(pair.getName()) ) {
				newValuePairs.add(pair);
			}
		}

		newValuePairs.add(new BasicNameValuePair(JSONP_CALLBACK_NAME, JSONP_CALLBACK_VALUE));

		String newQueryUri = URLEncodedUtils.format(newValuePairs, UTF8);

		URI newUri;

		try {
			newUri = new URI(
					uri.getScheme(),
					uri.getAuthority(),
					uri.getPath(),
					newQueryUri,
					uri.getFragment()
			);
		} catch (URISyntaxException e) {
			throw new SSOException("sso请求参数异常, request uri: " + uri, e);
		}

		HttpGet newHttpGet = new HttpGet(newUri);

		CloseableHttpResponse resp = httpClient.execute(this.baseUrl, newHttpGet);

		int code = resp.getStatusLine().getStatusCode();

		if ( code == HttpStatus.SC_OK ) {
			HttpEntity entity = resp.getEntity();
			String body = streamToString(entity.getContent());
			String jsonBody = body.replace(JSONP_CALLBACK_VALUE + "(", "").replace(");", "");
			return JSONObject.parseObject(jsonBody);
		} else {
			throw new SSOException("sso请求返回异常, 预期 200, 但是返回: " + resp.getStatusLine().toString());
		}
	}

	@Override
	public HttpEntity doRequest(HttpUriRequest httpPost) throws IOException {
		CloseableHttpResponse resp = httpClient.execute(this.baseUrl, httpPost);
		if ( checkStatusCode(resp) ) {
			return resp.getEntity();
		} else {
			throw new SSOException("sso请求返回异常, 预期 200, 但是返回: " + resp.getStatusLine().toString());
		}
	}

	private boolean checkStatusCode(CloseableHttpResponse resp) {
		return resp.getStatusLine().getStatusCode() == HttpStatus.SC_OK;
	}

}
