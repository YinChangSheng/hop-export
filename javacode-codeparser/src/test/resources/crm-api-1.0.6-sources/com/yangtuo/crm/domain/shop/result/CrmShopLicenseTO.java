package com.yangtuo.crm.domain.shop.result;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/6/15
 * 微信: yin80871901
 * 门店认证 - 列表专用
 */
public class CrmShopLicenseTO implements Serializable {

	private static final long serialVersionUID = 532871673178198811L;

	/**
	 * 门店ID
	 */
	private String shopId;

	/**
	 * 门店名称
	 */
	private String shopName;

	/**
	 * 门店服务人员 列表
	 */
	private List<ShopServerTo> afterServers;

	/**
	 * 门店类型
	 * @see com.yangtuo.crm.biz.shop.domain.enums.StoreTypeEnum
	 */
	private Integer storeType;

	/**
	 * 门店类型描述
	 */
	private String storeTypeDesc;

	/**
	 * 店铺账户类型
	 */
	private Integer shopType;

	/**
	 * 店铺账户类型 描述
	 */
	private String shopTypeDesc;

	/**
	 * 店铺 主联系人
	 */
	private String shopLinker;


	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 创建时间 yyyy-MM-dd HH:mm:ss
	 */
	private String createTimeStr;

	/**
	 * 区域省名称
	 */
	private String provinceArea;

	/**
	 * 开通时间
	 */
	private Date openTime;

	/**
	 * 开通时间 yyyy-MM-dd HH:mm:ss
	 */
	private String openTimeStr;

	/**
	 * 无资质元婴
	 */
	private String noneLicenseReason;

	/**
	 * 审核状态
	 */
	private Integer approveStatus;

	/**
	 *
	 */
	private String approveStatusDesc;

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public List<ShopServerTo> getAfterServers() {
		return afterServers;
	}

	public void setAfterServers(List<ShopServerTo> afterServers) {
		this.afterServers = afterServers;
	}

	public Integer getStoreType() {
		return storeType;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	public String getStoreTypeDesc() {
		return storeTypeDesc;
	}

	public void setStoreTypeDesc(String storeTypeDesc) {
		this.storeTypeDesc = storeTypeDesc;
	}

	public String getShopLinker() {
		return shopLinker;
	}

	public void setShopLinker(String shopLinker) {
		this.shopLinker = shopLinker;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public Integer getShopType() {
		return shopType;
	}

	public void setShopType(Integer shopType) {
		this.shopType = shopType;
	}

	public String getShopTypeDesc() {
		return shopTypeDesc;
	}

	public void setShopTypeDesc(String shopTypeDesc) {
		this.shopTypeDesc = shopTypeDesc;
	}

	public String getApproveStatusDesc() {
		return approveStatusDesc;
	}

	public void setApproveStatusDesc(String approveStatusDesc) {
		this.approveStatusDesc = approveStatusDesc;
	}

	public String getProvinceArea() {
		return provinceArea;
	}

	public void setProvinceArea(String provinceArea) {
		this.provinceArea = provinceArea;
	}

	public Date getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public String getOpenTimeStr() {
		return openTimeStr;
	}

	public void setOpenTimeStr(String openTimeStr) {
		this.openTimeStr = openTimeStr;
	}

	public String getNoneLicenseReason() {
		return noneLicenseReason;
	}

	public void setNoneLicenseReason(String noneLicenseReason) {
		this.noneLicenseReason = noneLicenseReason;
	}

	public Integer getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(Integer approveStatus) {
		this.approveStatus = approveStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
