package com.yangtuo.crm.api.contact;

import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.contact.form.AddContactRecordForm;
import com.yangtuo.crm.domain.contact.form.UpdateContactPlanForm;
import com.yangtuo.crm.domain.contact.query.ContactPlanQuery;
import com.yangtuo.crm.domain.contact.query.ContactRecordQuery;
import com.yangtuo.crm.domain.contact.vo.ContactPlanVO;
import com.yangtuo.crm.domain.contact.vo.ContactRecordVO;

import java.util.List;

/**
 * Created by feiying on 2018/4/10.
 */
public interface ContactApi {

    /**
     * 增加拜访小计
     * 
     * @param form
     * @return
     */
    ResultData<Boolean> addContactRecord(AddContactRecordForm form);

    /**
     * 新增拜访计划
     *
     * @param form
     * @return
     */
    ResultData<Boolean> addContactPlan(UpdateContactPlanForm form);

    /**
     * 修改拜访计划
     * 
     * @param form
     * @return
     */
    ResultData<Boolean> updateContactPlan(UpdateContactPlanForm form);

    /**
     * 查询拜访计划
     * 
     * @param query
     * @return
     */
    ResultData<List<ContactPlanVO>> queryContactPlan(ContactPlanQuery query);

    /**
     * 查询拜访小计
     *
     * @param query
     * @return
     */
    ResultData<List<ContactRecordVO>> queryContactRecord(ContactRecordQuery query);

}
