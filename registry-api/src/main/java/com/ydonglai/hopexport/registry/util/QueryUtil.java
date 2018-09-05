package com.ydonglai.hopexport.registry.util;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public class QueryUtil {

	public static String toEncodedUrl(Object obj) {
		return URLEncodedUtils.format(toPairList(obj), Charset.forName("UTF-8"));
	}

	public static List<NameValuePair> toPairList(Object obj) {
		ArrayList<NameValuePair> pairs = new ArrayList<>();
		try {
			Map<String, String> keyVals = BeanUtils.describe(obj);
			for (Map.Entry<String, String> kv : keyVals.entrySet()) {
				if ( "class".equals(kv.getKey()) ) continue;
				pairs.add(new BasicNameValuePair(kv.getKey(), kv.getValue()));
			}
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		return pairs;
	}

}
