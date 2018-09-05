package com.ydonglai.hopexport.registry.webapi.hopapi.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
@Data
@ToString
public class ApiListQuery {

	private String apiName;

	private String apiVersion;

}
