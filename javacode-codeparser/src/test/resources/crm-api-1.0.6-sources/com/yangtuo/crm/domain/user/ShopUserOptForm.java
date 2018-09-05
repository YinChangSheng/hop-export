package com.yangtuo.crm.domain.user;

import java.io.Serializable;

/**
 * 门店账号操作(新增/修改)
 *
 * @author 木鸢
 * create by2018-04-12 14:54
 */
public class ShopUserOptForm implements Serializable {

	private static final long serialVersionUID = 1875952854367007387L;
	private String id;
	private String shopId;
	private String userRealName;
	/** 是否总店管理员 */
	private Integer isManager;
	private String userPass;
	private String loginPhone;
	/**
	 * 2门店 11商机
	 * @see com.yt.ustone.enums.UserTypeEnum
	 */
	private Integer userType;

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserRealName() {
		return userRealName;
	}

	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}


	public Integer getIsManager() {
		return isManager;
	}

	public void setIsManager(Integer manager) {
		isManager = manager;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getLoginPhone() {
		return loginPhone;
	}

	public void setLoginPhone(String loginPhone) {
		this.loginPhone = loginPhone;
	}
}
