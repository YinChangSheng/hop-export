package com.yangtuo.crm.domain.shop.query;

import com.yangtuo.crm.domain.base.CrmBaseQuery;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/6/15
 * 微信: yin80871901
 */
public class ShopLicenseQuery extends CrmBaseQuery {

	/**
	 * 店铺手机
	 */
	private String shopPhone;

	/**
	 * 店铺名称
	 */
	private String shopName;

	/**
	 * 部门ID
	 */
	private Long deptId;

	/**
	 * 无资质原因 code
	 */
	private Integer noLicenseCauseCode;

	/**
	 * 审核状态
	 */
	private Integer approveStatus;

	/**
	 * 排序字段
	 */
	private String sortField;

	private String sortType;

	/**
	 * 根据售后服务人员查询
	 */
	private List<String> afterServer;

	public String getShopPhone() {
		return shopPhone;
	}

	public void setShopPhone(String shopPhone) {
		this.shopPhone = shopPhone;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Integer getNoLicenseCauseCode() {
		return noLicenseCauseCode;
	}

	public void setNoLicenseCauseCode(Integer noLicenseCauseCode) {
		this.noLicenseCauseCode = noLicenseCauseCode;
	}

	public List<String> getAfterServer() {
		return afterServer;
	}

	public void setAfterServer(List<String> afterServer) {
		this.afterServer = afterServer;
	}

	public Integer getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(Integer approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
