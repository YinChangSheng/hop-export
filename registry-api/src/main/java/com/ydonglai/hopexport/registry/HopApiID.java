package com.ydonglai.hopexport.registry;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 * apiName & env & version 唯一标记一个Api
 */
public class HopApiID {

	private String apiName;

	private String env;

	private String version;

	public HopApiID(String apiName, String env, String version) {
		this.apiName = apiName;
		this.env = env;
		this.version = version;
	}

	public String getApiName() {
		return apiName;
	}

	public String getEnv() {
		return env;
	}

	public String getVersion() {
		return version;
	}

}
