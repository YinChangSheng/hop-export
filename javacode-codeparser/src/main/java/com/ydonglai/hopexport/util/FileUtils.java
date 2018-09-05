package com.ydonglai.hopexport.util;

import java.net.URL;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/13
 * 微信: yin80871901
 */
public class FileUtils {

	public static String getExtension(String fileName) {
		char ch;
		int len;
		if(fileName==null ||
				(len = fileName.length())==0 ||
				(ch = fileName.charAt(len-1))=='/' || ch=='\\' || //in the case of a directory
				ch=='.' ) //in the case of . or ..
			return "";
		int dotInd = fileName.lastIndexOf('.'),
				sepInd = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
		if( dotInd<=sepInd )
			return "";
		else
			return fileName.substring(dotInd+1).toLowerCase();
	}

	public static String getFilePath(String fileName) {
		URL filePath = Thread
				.currentThread()
				.getContextClassLoader()
				.getResource(fileName);
		return filePath != null ? filePath.getFile() : null;
	}

}
