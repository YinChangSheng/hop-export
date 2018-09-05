package com.ydonglai.hopexport.codeParser;

import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public class MethodDefinition {

	private String methodName;

	private String returnType;

	private List<ArgumentDefinition> arguments;

	private List<AnnotationDefinition> annotations;

	public MethodDefinition(String methodName, String returnType, List<ArgumentDefinition> arguments, List<AnnotationDefinition> annotations) {
		this.methodName = methodName;
		this.returnType = returnType;
		this.arguments = arguments;
		this.annotations = annotations;
	}

	public String getMethodName() {
		return methodName;
	}

	public String getReturnType() {
		return returnType;
	}

	public List<ArgumentDefinition> getArguments() {
		return arguments;
	}

	public List<AnnotationDefinition> getAnnotations() {
		return annotations;
	}

}
