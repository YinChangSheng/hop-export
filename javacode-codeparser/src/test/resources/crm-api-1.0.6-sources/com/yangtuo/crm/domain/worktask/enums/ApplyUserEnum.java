package com.yangtuo.crm.domain.worktask.enums;

import java.util.Objects;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/5/11
 * 微信: yin80871901
 */
public enum ApplyUserEnum {

	WITH_ME(1), // 我发起的工单
	WITH_OTHER(2); // 别人发起的

	private int code;

	ApplyUserEnum(int code) {
		this.code = code;
	}

	public static ApplyUserEnum codeOf(Integer code) {
		for ( ApplyUserEnum user : values() ) {
			if ( Objects.equals(user.code, code) ) {
				return user;
			}
		}
		return null;
	}

	public int getCode() {
		return code;
	}

}
