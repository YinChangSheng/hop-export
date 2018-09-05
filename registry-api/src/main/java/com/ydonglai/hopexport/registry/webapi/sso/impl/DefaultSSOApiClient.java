package com.ydonglai.hopexport.registry.webapi.sso.impl;

import com.ydonglai.hopexport.registry.webapi.sso.SSOApiClient;
import com.ydonglai.hopexport.registry.webapi.sso.SSOException;
import com.ydonglai.hopexport.registry.webapi.sso.SSOHttp;
import com.ydonglai.hopexport.registry.webapi.sso.SSOSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.NameValuePair;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.cookie.Cookie;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
@Slf4j
public class DefaultSSOApiClient implements SSOApiClient {

	private SSOHttp http;

	private CookieStore cookieStore;

	private static final String HopTestDomain = "http://test.admin.api.hipac.cn";

	private static final String RsaExponent = "10001";

	private static final String HopAppKey = "HopAdmin";

	private static final String HopAppId = "daca7958b2f6b8650bee9888516d9a8f";

	public DefaultSSOApiClient(SSOHttp http, CookieStore cookieStore) {
		this.http = http;
		this.cookieStore = cookieStore;
	}

	public String getPublicKey() {
		HttpGet httpGet = new HttpGet("/sso/getPublicKey.json");
		try {
			Map<String, Object> data = http.doJsonp(httpGet);
			return (String) data.get("msg");
		} catch (IOException e) {
			throw new SSOException("请求异常: ", e);
		}
	}

	private List<NameValuePair> doLogin(String userName, String modulus, String encryptedPassword, String emailCode) {
		List<NameValuePair> pairList = new ArrayList<>();
		pairList.add(new BasicNameValuePair("t", String.valueOf(System.currentTimeMillis())));
		pairList.add(new BasicNameValuePair("emailCode", emailCode));
		pairList.add(new BasicNameValuePair("userNickName", userName));
		pairList.add(new BasicNameValuePair("publicKey", modulus));
		pairList.add(new BasicNameValuePair("returnURL", ""));
		pairList.add(new BasicNameValuePair("deviceId", "54cc00586030946722c18af98915d5a7"));
		pairList.add(new BasicNameValuePair("app", HopAppKey));
		pairList.add(new BasicNameValuePair("app_", HopAppId));
		pairList.add(new BasicNameValuePair("userPass", encryptedPassword));
		pairList.add(new BasicNameValuePair("os", "OS X 10.13.6 64-bit"));
		pairList.add(new BasicNameValuePair("model", "Chrome 69.0.3497.57 on OS X 10.13.6 64-bit"));
		pairList.add(new BasicNameValuePair("osv", "10.13.6"));
		pairList.add(new BasicNameValuePair("isApp", "false"));
		return pairList;
	}

	@Override
	public SSOSession webLogin(String userName, String password, String emailCode) {

		HttpPost httpPost = new HttpPost("/sso/adminLogin.json");
		String modulus = getPublicKey(); // rsa modulus
		PublicKey publicKey = SSOSignUtil.makePublicKey(modulus, RsaExponent);
		String encryptedPassword = SSOSignUtil.encrypt(publicKey, password);
		List<NameValuePair> params = doLogin(userName, modulus, encryptedPassword, emailCode);

		try {

			httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

			http.doRequest(httpPost);

			List<Cookie> cookieList = cookieStore.getCookies();

			SSOSession session = new SSOSession();

			try {
				// 填充 cookie
				for ( Cookie cookie : cookieList ) {
					session.setCookieValue(cookie.getName(), cookie.getValue());
				}
			} catch (IllegalArgumentException ex) {
				log.warn("sso返回了未知的cookie", ex);
			}

			session.setSessionId(session.getCookieValue(SSOSession.JSESSIONID));
			session.setAppId(HopAppId);
			session.setAppKey(HopAppKey);

			return session;

		} catch (IOException e) {
			throw new SSOException("登入请求异常: ", e);
		}

	}


	private List<NameValuePair> doLogout() {
		List<NameValuePair> pairList = new ArrayList<>();
		pairList.add(new BasicNameValuePair("app", DefaultSSOApiClient.HopAppKey));
		pairList.add(new BasicNameValuePair("app_", DefaultSSOApiClient.HopAppId));
		pairList.add(new BasicNameValuePair("returnURL", DefaultSSOApiClient.HopTestDomain));
		return pairList;
	}

	@Override
	public void logout() {
		List<NameValuePair> pairList = doLogout();
		String queryString = URLEncodedUtils.format(pairList, "UTF-8");
		try {
			HttpPost httpPost = new HttpPost("/sso/logout.do?" + queryString);
			http.doRequest(httpPost);
		} catch (IOException e) {
			throw new SSOException("登出请求异常: ", e);
		}

	}

}
