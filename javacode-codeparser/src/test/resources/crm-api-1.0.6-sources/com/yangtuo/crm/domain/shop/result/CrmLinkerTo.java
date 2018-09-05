package com.yangtuo.crm.domain.shop.result;

import java.io.Serializable;

/**
 * @author 木鸢
 */
public class CrmLinkerTo implements Serializable{

	private static final long serialVersionUID = 1L;
	/** id*/
	private String id;
	/**联系人类型（1.门店主联系人，2供应商主联系人，3门店备用联系人，4供应商备用联系人）*/
	private Integer linkerType;
	/**联系人姓名*/
	private String linkerRealName;

	/**联系人电话*/
	private String linkerPhone;
	/**关联id*/
	private String linkerObjId;
	/**QQ*/
	private String linkerQq;
	/**邮箱*/
	private String linkerEmail;
	/** 旺旺 */
	private String linkerWw;

	/** 性别*/
	private Integer linkerSex;
	private String linkerSexDesc;

	/**年龄*/
	private Integer linkerAge;
	private String linkerAgeDesc;

	/**职位*/
	private String linkerJob;
	private String linkerJobDesc;

	/** 微信*/
	private String linkerWx;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getLinkerSex() {
		return linkerSex;
	}

	public void setLinkerSex(Integer linkerSex) {
		this.linkerSex = linkerSex;
	}

	public Integer getLinkerAge() {
		return linkerAge;
	}

	public void setLinkerAge(Integer linkerAge) {
		this.linkerAge = linkerAge;
	}

	public String getLinkerWx() {
		return linkerWx;
	}

	public void setLinkerWx(String linkerWx) {
		this.linkerWx = linkerWx;
	}

	/** 旺旺 */
    public String getLinkerWw() {
        return linkerWw;
    }

    /** 旺旺 */
    public void setLinkerWw(String linkerWw) {
        this.linkerWw = linkerWw;
    }

    public String getLinkerEmail() {
		return linkerEmail;
	}

	public void setLinkerEmail(String linkerEmail) {
		this.linkerEmail = linkerEmail;
	}


	public Integer getLinkerType() {
		return linkerType;
	}

	public void setLinkerType(Integer linkerType) {
		this.linkerType = linkerType;
	}

	public String getLinkerRealName() {
		return linkerRealName;
	}

	public void setLinkerRealName(String linkerRealName) {
		this.linkerRealName = linkerRealName;
	}

	public String getLinkerJob() {
		return linkerJob;
	}

	public void setLinkerJob(String linkerJob) {
		this.linkerJob = linkerJob;
	}

	public String getLinkerSexDesc() {
		return linkerSexDesc;
	}

	public void setLinkerSexDesc(String linkerSexDesc) {
		this.linkerSexDesc = linkerSexDesc;
	}

	public String getLinkerAgeDesc() {
		return linkerAgeDesc;
	}

	public void setLinkerAgeDesc(String linkerAgeDesc) {
		this.linkerAgeDesc = linkerAgeDesc;
	}

	public String getLinkerJobDesc() {
		return linkerJobDesc;
	}

	public void setLinkerJobDesc(String linkerJobDesc) {
		this.linkerJobDesc = linkerJobDesc;
	}

	public String getLinkerPhone() {
		return linkerPhone;
	}

	public void setLinkerPhone(String linkerPhone) {
		this.linkerPhone = linkerPhone;
	}

	public String getLinkerObjId() {
		return linkerObjId;
	}

	public void setLinkerObjId(String linkerObjId) {
		this.linkerObjId = linkerObjId;
	}

	public String getLinkerQq() {
		return linkerQq;
	}

	public void setLinkerQq(String linkerQq) {
		this.linkerQq = linkerQq;
	}
}
