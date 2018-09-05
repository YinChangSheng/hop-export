package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/6/22
 * 微信: yin80871901
 */
public class CrmAppViewTo implements Serializable {

	private static final long serialVersionUID = -811840216957234268L;

	private boolean showApproveBtn;

	public boolean getShowApproveBtn() {
		return showApproveBtn;
	}

	public void setShowApproveBtn(boolean showViewApproveBtn) {
		this.showApproveBtn = showViewApproveBtn;
	}
}
