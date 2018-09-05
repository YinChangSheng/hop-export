package com.ydonglai.hopexport.registry.webapi.sso;

import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
@Data
@ToString
public class SSOSession {

	public static final String JSESSIONID = "JSESSIONID";

	protected static final String STOKEN = "s_token";

	protected static final String BKUid = "bkuid";

	protected static final String SID = "s_id";

	protected static final String YDUSS = "yduss_test_m";

	protected static final String YDUSS_V2 = "yduss_test_m_v2";

	private final Map<String, String> data = new HashMap<>();

	private String sessionId;

	private String appKey;

	private String appId;

	private Set<String> keys() {
		return data.keySet();
	}

	private String variableKey(String key) {
		if ( JSESSIONID.equals(key) ) {
			return JSESSIONID;
		}
		if ( STOKEN.equals(key) ) {
			return STOKEN;
		}
		if ( SID.equals(key) ) {
			return SID;
		}
		if ( YDUSS.equals(key) ) {
			return YDUSS;
		}
		if ( YDUSS_V2.equals(key) ) {
			return YDUSS_V2;
		}
		if ( BKUid.equals(key) ) {
			return BKUid;
		}
		throw new IllegalArgumentException("key: " + key + " not variable");
	}

	public String getCookieValue(String key) {
		return data.get(variableKey(key));
	}

	public String setCookieValue(String key, String val) {
		return data.put(variableKey(key), val);
	}

}
