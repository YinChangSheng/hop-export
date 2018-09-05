package com.ydonglai.hopexport.codeParser;

import java.io.File;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public interface JarFileParser {

	void parse(File jarFile) throws ParseException;

}
