package com.yangtuo.crm.domain.user;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.io.Serializable;

/**
 * 门店查询表单
 *
 * @author 木鸢
 * create by2018-04-12 14:54
 */
public class ShopUserQueryForm extends CrmBaseQuery implements Serializable {

	private static final long serialVersionUID = 4395844216307399359L;
	private String shopId;
	private String userNickName;
	/**
	 * 昵称
	 */
	private String userRealName;
	/**
	 * 登陆手机号
	 */
	private String loginPhone;
	/**
	 * 2门店 11商机
	 * @see com.yt.ustone.enums.UserTypeEnum
	 */
	private Integer userType;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}

	public String getLoginPhone() {
		return loginPhone;
	}

	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}
}
