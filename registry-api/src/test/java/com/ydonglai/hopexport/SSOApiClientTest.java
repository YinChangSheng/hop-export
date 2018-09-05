package com.ydonglai.hopexport;

import com.ydonglai.hopexport.registry.webapi.sso.SSOApiClient;
import com.ydonglai.hopexport.registry.webapi.sso.SSOHttp;
import com.ydonglai.hopexport.registry.webapi.sso.SSOSession;
import com.ydonglai.hopexport.registry.webapi.sso.impl.DefaultSSOApiClient;
import com.ydonglai.hopexport.registry.webapi.sso.impl.DefaultSSOHttp;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/9/3
 */
@Slf4j
public class SSOApiClientTest {

	private String baseUrl = "http://master.login.hipac.cn";

	private static CloseableHttpClient httpClient;

	private static BasicCookieStore cookieStore = new BasicCookieStore();

	@BeforeClass
	public static void setUp() {
		httpClient = HttpClients.custom()
				.setDefaultCookieStore(cookieStore)
				.setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(2000).setSocketTimeout(5000).build())
				.build();
	}

	@Test
	public void testLogin() {
		SSOHttp http = new DefaultSSOHttp(baseUrl, httpClient);
		SSOApiClient ssoApiClient = new DefaultSSOApiClient(http, cookieStore);
		SSOSession session = ssoApiClient.webLogin("donglai", "hipac228", "666666");
		Assert.assertTrue(!session.getSessionId().isEmpty());
	}

}
