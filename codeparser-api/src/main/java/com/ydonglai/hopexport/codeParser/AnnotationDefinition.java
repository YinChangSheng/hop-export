package com.ydonglai.hopexport.codeParser;

import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public class AnnotationDefinition {

	static class AnnoArg {

		public AnnoArg(String name, Object value, String typeName) {
			this.name = name;
			this.value = value;
			this.typeName = typeName;
		}

		private String name;
		private Object value;
		private String typeName;

		public String getName() {
			return name;
		}
		public Object getValue() {
			return value;
		}
		public String getTypeName() {
			return typeName;
		}
	}

	public AnnotationDefinition(List<AnnoArg> arguments) {
		this.arguments = arguments;
	}

	private List<AnnoArg> arguments;

	public List<AnnoArg> getArguments() {
		return arguments;
	}

}
