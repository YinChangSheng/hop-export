package com.ydonglai.hopexport.registry.webapi.hopapi.dto;

import lombok.Data;

import java.util.List;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
@Data
public class HopParam {

	@Data
	static class ClassMeta {

		private String className;

		private List<HopParam> fieldMetaList;

	}

	private String fieldName;

	private ClassMeta classMeta;

}
