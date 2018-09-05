package com.ydonglai.hopexport.registry.webapi.sso;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/29
 */
public class SSOException extends RuntimeException {

	public SSOException(String message) {
		super(message);
	}

	public SSOException(String message, Throwable cause) {
		super(message, cause);
	}
}
