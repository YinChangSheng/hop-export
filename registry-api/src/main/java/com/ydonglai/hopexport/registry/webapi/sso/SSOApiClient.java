package com.ydonglai.hopexport.registry.webapi.sso;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public interface SSOApiClient {

	SSOSession webLogin(String userName, String password, String emailCode);

	void logout();

}
