package com.ydonglai.hopexport.codeParser;

import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public class InterfaceDefinition {

	private String className;

	private List<AnnotationDefinition> annotations;

	private List<MethodDefinition> methods;

	public InterfaceDefinition(String className, List<AnnotationDefinition> annotations, List<MethodDefinition> methods) {
		this.className = className;
		this.annotations = annotations;
		this.methods = methods;
	}

	public String getClassName() {
		return className;
	}

	public List<AnnotationDefinition> getAnnotations() {
		return annotations;
	}

	public List<MethodDefinition> getMethods() {
		return methods;
	}

}
