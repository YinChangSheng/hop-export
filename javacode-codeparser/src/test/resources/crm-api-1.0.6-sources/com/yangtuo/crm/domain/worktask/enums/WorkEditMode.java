package com.yangtuo.crm.domain.worktask.enums;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/5/9
 * 微信: yin80871901
 */
public enum WorkEditMode {

	EDITABLE_DEAL_USER(1), EDITABLE_CHECK_USER(2), READABLE(3);

	WorkEditMode(int mode) {
		this.mode = mode;
	}

	private int mode;

	public int getMode() {
		return mode;
	}
}
