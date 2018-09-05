package com.yangtuo.crm.domain.worktask.enums;

import java.util.Objects;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/5/11
 * 微信: yin80871901
 */
public enum DealStatusEnum {

    WAITE_DEAL(1, "待处理"),
    HAVE_DEAL(2, "已处理"),
    AUTO_DEAL(3, "超时自动处理");

    Integer code;

    String desc;

    DealStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static DealStatusEnum codeOf(Integer status) {
        for (DealStatusEnum st : values()) {
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
