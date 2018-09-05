package com.ydonglai.hopexport.registry.webapi.hopapi;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public class HopWebApi {

	public static final String METHOD_GET = "GET";

	public static final String METHOD_POST = "POST";

	public final String uri;

	public final String method;

	public final String contentType;

	public final String desc;

	private static final String defaultContentType = "application/x-www-form-urlencoded; charset=UTF-8";

	public HopWebApi(String uri, String method, String desc) {
		this.uri = uri;
		this.method = method;
		this.contentType = defaultContentType;
		this.desc = desc;
	}

	public HopWebApi(String uri, String method, String contentType, String desc) {
		this.uri = uri;
		this.method = method;
		this.contentType = contentType;
		this.desc = desc;
	}

}
