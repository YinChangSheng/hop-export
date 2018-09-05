package com.yangtuo.crm.domain.worktask.enums;

import java.util.Objects;

public enum CheckResultEnum {

    EXECELLENT(1, "优秀"),
    GOOD(2, "良好"),
    PASS(3, "合格"),
    DIS_PASS(4, "不合格"),;

    Integer code;
    String desc;

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    CheckResultEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static CheckResultEnum codeOf(Integer code) {
        for (CheckResultEnum st : values()) {
            if (Objects.equals(st.code, code)) {
                return st;
            }
        }
        return null;
    }

}
