package com.yangtuo.crm.domain.applyShop.to;

import com.yangtuo.crm.domain.contact.vo.ContactPlanVO;
import com.yangtuo.crm.domain.contact.vo.ContactRecordVO;
import com.yangtuo.crm.domain.shop.result.CrmLinkerTo;
import com.yangtuo.crm.domain.shop.result.CrmShopOptRecordTO;
import com.yangtuo.crm.domain.shop.result.ShopQualificationTo;
import com.yangtuo.crm.domain.shop.result.ShopServerTo;

import java.io.Serializable;
import java.util.List;

/**
 * @author Created by diandian on 2018/4/17.
 */
public class ApplyShopDetailTO implements Serializable{

    private static final long serialVersionUID = 8799529644711474557L;
    private String shopId;

    private Long applyShopId;

    private String shopName;

    /**
     * 商机基础信息
     */
    private ApplyShopTO applyShopTO;

    /**
     * 拜访计划
     */
    private List<ContactPlanVO> contactPlanVOS;

    /**
     * 联系小计
     */
    private List<ContactRecordVO> contactRecordVOS;

    /**
     * 服务人员
     */
    private ShopServerTo shopServerTo;

    /**
     * 商机操作记录
     */
    private List<CrmShopOptRecordTO> crmShopOptRecordTOS;

    /**
     * 资质信息
     */
    private ShopQualificationTo shopQualificationTo;

    /**
     * 联系人列表
     * @return
     */
    private List<CrmLinkerTo> crmLinkerTos;

    private String parentShopName;

    private String lastLinkerId;

    public String getParentShopName() {
        return parentShopName;
    }

    public void setParentShopName(String parentShopName) {
        this.parentShopName = parentShopName;
    }

    public String getLastLinkerId() {
        return lastLinkerId;
    }

    public void setLastLinkerId(String lastLinkerId) {
        this.lastLinkerId = lastLinkerId;
    }

    public List<CrmLinkerTo> getCrmLinkerTos() {
        return crmLinkerTos;
    }

    public void setCrmLinkerTos(List<CrmLinkerTo> crmLinkerTos) {
        this.crmLinkerTos = crmLinkerTos;
    }

    public ShopQualificationTo getShopQualificationTo() {
        return shopQualificationTo;
    }

    public void setShopQualificationTo(ShopQualificationTo shopQualificationTo) {
        this.shopQualificationTo = shopQualificationTo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Long getApplyShopId() {
        return applyShopId;
    }

    public void setApplyShopId(Long applyShopId) {
        this.applyShopId = applyShopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public ApplyShopTO getApplyShopTO() {
        return applyShopTO;
    }

    public void setApplyShopTO(ApplyShopTO applyShopTO) {
        this.applyShopTO = applyShopTO;
    }

    public List<ContactPlanVO> getContactPlanVOS() {
        return contactPlanVOS;
    }

    public void setContactPlanVOS(List<ContactPlanVO> contactPlanVOS) {
        this.contactPlanVOS = contactPlanVOS;
    }

    public List<ContactRecordVO> getContactRecordVOS() {
        return contactRecordVOS;
    }

    public void setContactRecordVOS(List<ContactRecordVO> contactRecordVOS) {
        this.contactRecordVOS = contactRecordVOS;
    }

    public ShopServerTo getShopServerTo() {
        return shopServerTo;
    }

    public void setShopServerTo(ShopServerTo shopServerTo) {
        this.shopServerTo = shopServerTo;
    }

    public List<CrmShopOptRecordTO> getCrmShopOptRecordTOS() {
        return crmShopOptRecordTOS;
    }

    public void setCrmShopOptRecordTOS(List<CrmShopOptRecordTO> crmShopOptRecordTOS) {
        this.crmShopOptRecordTOS = crmShopOptRecordTOS;
    }
}
