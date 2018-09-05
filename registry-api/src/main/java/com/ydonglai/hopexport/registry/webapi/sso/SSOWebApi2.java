package com.ydonglai.hopexport.registry.webapi.sso;

import com.ydonglai.hopexport.registry.webapi.CookieHelper;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import sun.misc.BASE64Encoder;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public class SSOWebApi2 {

	public static void main(String[] args) throws Exception {

//		String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDvA8oLd2Vcta4BuoZTQr+AkipG"
//				+ "01hyDrgl1shzk0T0nV7Jy/LtaTnjid2tlSa2uHtC0ZSnqYwZIvYEWndIAx+kKElS"
//				+ "bhgGQI4/eDbLXtx6IZDaSCLuugPz2XPqivu2b4iY0o3hkBWPcMeywtkt1stPaqEm"
//				+ "N9RYxaekmCfiROI6CwIDAQAB";
//
//		// String publicKey = "8515f1a00b5e6eb8eb96b7e32b7b0705e60d14cc18f386ea6d92125ac309b1d5ab2629a16809b93eb06070665f2a122f21263f32719b095059048ece51af1a91";
//
//		String userName = "donglai";
//		String password = "hipac228";
//
//		try {
//
//			URL filePath = Thread.currentThread().getContextClassLoader().getResource("111.txt");
//
//			String path = new File(filePath.getFile()).getParent();
//
//			String encodePass = CertRSAUtil.encryptWithBase64(password, publicKey);
//
//			// HttpPost httpPost = new HttpPost("http://master.login.hipac.cn/sso/h5/1.0.0/hopAdminTestLogin");
//
//			HttpPost httpPost = new HttpPost("http://master.login.hipac.cn/sso/h5/1.0.0/hopAdminTestLogin");
//
//			// HttpPost httpPost = new HttpPost("http://master.login.hipac.cn/sso/adminLogin.json");
//
//			List<NameValuePair> paramsList = new ArrayList<>();
//			String loginData = "{\"publicKey\": \""+ publicKey +"\", \"userNickName\":\"xiaoer\", \"userPass\": \""+ encodePass +"\"}";
//			paramsList.add(new BasicNameValuePair("appKey", "1002"));
//			paramsList.add(new BasicNameValuePair("data", loginData));
//			paramsList.add(new BasicNameValuePair("t", "1535437358737"));
//			paramsList.add(new BasicNameValuePair("deviceId", "54cc00586030946722c18af98915d5a7"));
//			paramsList.add(new BasicNameValuePair("app", "HopAdmin"));
//			paramsList.add(new BasicNameValuePair("app_", "daca7958b2f6b8650bee9888516d9a8f"));
//			paramsList.add(new BasicNameValuePair("returnURL", "http%253A%252F%252Ftest.admin.api.hipac.cn%252Fmoduleview%252Flist.do%253F_m_id%253D3063"));
//			paramsList.add(new BasicNameValuePair("userNickName", userName));
//			paramsList.add(new BasicNameValuePair("userPass", encodePass));
//			paramsList.add(new BasicNameValuePair("emailCode", "666666"));
//			paramsList.add(new BasicNameValuePair("publicKey", publicKey));
//			paramsList.add(new BasicNameValuePair("os", "OS X 10.13.6 64-bit"));
//			paramsList.add(new BasicNameValuePair("model", "Chrome 69.0.3497.57 on OS X 10.13.6 64-bit"));
//			paramsList.add(new BasicNameValuePair("osv", "10.13.6"));
//			paramsList.add(new BasicNameValuePair("isApp", "false"));
//
//			BasicCookieStore cookieStore = new BasicCookieStore();
//
//			CookieHelper helper = new CookieHelper(path, "cookie.txt");
//
//			CloseableHttpClient httpClient = HttpClients.custom()
//					.setDefaultCookieStore(cookieStore)
//					.setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(2000).setSocketTimeout(5000).build())
//					.build();
//
//			httpPost.setEntity(new UrlEncodedFormEntity(paramsList, "UTF-8"));
//
//			CloseableHttpResponse response = httpClient.execute(httpPost);
//
//			if ( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ) {
//				helper.saveCookies(cookieStore);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		test1();

	}

	public static void test1() throws IOException, DecoderException, NoSuchAlgorithmException, InvalidKeySpecException {

		String modulus = "89443e960385595e63e99dda36d6bb558f0ec61537b8f131e57f0f9765975008bfb5fad6cb6d2289048f280ea22f3c21587a7bf0c1e6818ad2d9d613816baf2b";
		String exponent = "10001";
		String username = "donglai";
		String password = "hipac228";

		RSAPublicKeySpec spec = new RSAPublicKeySpec(new BigInteger(modulus, 16), new BigInteger(exponent, 16));

		KeyFactory factory = KeyFactory.getInstance("RSA");

		PublicKey publicKey1 = factory.generatePublic(spec);

		String passwd = "";

		try {
			byte[] binaryData = CertRSAUtil.encrypt(publicKey1, password.getBytes());
			passwd = new String(Hex.encodeHex(binaryData));
			System.out.println(passwd);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<NameValuePair> pairList = new ArrayList<>();
		pairList.add(new BasicNameValuePair("t", String.valueOf(System.currentTimeMillis())));
		pairList.add(new BasicNameValuePair("emailCode", "666666"));
		pairList.add(new BasicNameValuePair("userNickName", username));
		pairList.add(new BasicNameValuePair("publicKey", modulus));
		pairList.add(new BasicNameValuePair("returnURL", ""));
		pairList.add(new BasicNameValuePair("deviceId", "54cc00586030946722c18af98915d5a7"));
		pairList.add(new BasicNameValuePair("app", "1"));
		pairList.add(new BasicNameValuePair("app_", "8dda532f2eafa8271d9f639eda5f71cc"));
		pairList.add(new BasicNameValuePair("userPass", passwd));
		pairList.add(new BasicNameValuePair("os", "OS X 10.13.6 64-bit"));
		pairList.add(new BasicNameValuePair("model", "Chrome 69.0.3497.57 on OS X 10.13.6 64-bit"));
		pairList.add(new BasicNameValuePair("osv", "10.13.6"));
		pairList.add(new BasicNameValuePair("isApp", "false"));


		BasicCookieStore cookieStore = new BasicCookieStore();

		URL filePath = Thread.currentThread().getContextClassLoader().getResource("111.txt");

		String path = new File(filePath.getFile()).getParent();

		CookieHelper helper = new CookieHelper(path, "cookie.txt");

		CloseableHttpClient httpClient = HttpClients.custom()
					.setDefaultCookieStore(cookieStore)
					.setDefaultRequestConfig(RequestConfig.custom().setConnectTimeout(2000).setSocketTimeout(5000).build())
					.build();

		HttpPost httpPost = new HttpPost("http://master.login.hipac.cn/sso/adminLogin.json");

		httpPost.setEntity(new UrlEncodedFormEntity(pairList, "UTF-8"));

		CloseableHttpResponse response = httpClient.execute(httpPost);

		if ( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ) {
			helper.saveCookies(cookieStore);
		}

	}

}
