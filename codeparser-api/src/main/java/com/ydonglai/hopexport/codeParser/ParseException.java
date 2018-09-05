package com.ydonglai.hopexport.codeParser;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public class ParseException extends RuntimeException {
	public ParseException(String message) {
		super(message);
	}
	public ParseException(String message, Throwable cause) {
		super(message, cause);
	}
}
