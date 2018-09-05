package com.yangtuo.crm.domain.worktask.enums;

import java.util.Objects;

/**
 * Created by yuchengjian on 2018/5/15.
 */
public enum FormDealStatusEnum {

    WAITE_DEAL(0, "待处理"),
    HAVE_DEAL(1, "已处理");

    Integer code;

    String desc;

    FormDealStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static FormDealStatusEnum codeOf(Integer status) {
        for (FormDealStatusEnum st : values()) {
            if (Objects.equals(st.code, status)) {
                return st;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
