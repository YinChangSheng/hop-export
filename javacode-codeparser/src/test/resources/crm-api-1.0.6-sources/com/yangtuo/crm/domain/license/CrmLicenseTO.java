package com.yangtuo.crm.domain.license;

import com.yangtuo.crm.domain.shop.result.ShopQualificationTo;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class CrmLicenseTO implements Serializable{

    private static final long serialVersionUID = -5584596072614996055L;

    ShopQualificationTo qualificationTo;

    List<ApproveLogTO> approveLogList;

    public ShopQualificationTo getQualificationTo() {
        return qualificationTo;
    }

    public void setQualificationTo(ShopQualificationTo qualificationTo) {
        this.qualificationTo = qualificationTo;
    }

    public List<ApproveLogTO> getApproveLogList() {
        return approveLogList;
    }

    public void setApproveLogList(List<ApproveLogTO> approveLogList) {
        this.approveLogList = approveLogList;
    }
}
