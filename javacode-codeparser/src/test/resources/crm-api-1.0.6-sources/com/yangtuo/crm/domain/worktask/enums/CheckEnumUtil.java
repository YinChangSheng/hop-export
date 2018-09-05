package com.yangtuo.crm.domain.worktask.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/4/27
 * 微信: yin80871901
 *
 * CheckEnum.VisitRecordCheck.codeOf()
 * CheckEnum.VisitRecordCheck.nameOf()
 */

public class CheckEnumUtil {

	private static class CheckEnumAndPut<K, V> {

		private Map<K, V> map;

		public CheckEnumAndPut(Map<K, V> map) {
			this.map = map;
		}

		private CheckEnumAndPut<K, V> andPut(K key, V val) {
			map.put(key, val);
			return this;
		}

	}

	private static final Map<Integer, String> VisitRecordCheckMap = new HashMap<>();

	private static final Map<Integer, String> PhotoCheckMap = new HashMap<>();

	private static final Map<Integer, String> TotalCheckMap = new HashMap<>();

	static {
		CheckEnumAndPut<Integer, String> ut1 = new CheckEnumAndPut<>(VisitRecordCheckMap);
		ut1.andPut(1, "优秀").andPut(2, "良好").andPut(3, "合格").andPut(4, "不合格");

		CheckEnumAndPut<Integer, String> ut2 = new CheckEnumAndPut<>(PhotoCheckMap);
		ut2.andPut(1, "优秀").andPut(2, "良好").andPut(3, "合格").andPut(4, "不合格");

		CheckEnumAndPut<Integer, String> ut3 = new CheckEnumAndPut<>(TotalCheckMap);
		ut3.andPut(1, "优秀").andPut(2, "良好").andPut(3, "合格").andPut(4, "不合格");
	}

	public static String codeToName(CheckEnum checkEnum, Integer code) {
		switch (checkEnum) {
			case PhotoCheck:
				return PhotoCheckMap.get(code);
			case TotalCheck:
				return TotalCheckMap.get(code);
			case VisitRecordCheck:
				return VisitRecordCheckMap.get(code);
		}
		return null;
	}

}