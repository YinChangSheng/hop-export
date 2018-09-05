package com.ydonglai.hopexport.codeParser;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public class ArgumentDefinition {

	private String name;

	private String typeName;

	public ArgumentDefinition(String name, String typeName) {
		this.name = name;
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

	public String getName() {
		return name;
	}

}
