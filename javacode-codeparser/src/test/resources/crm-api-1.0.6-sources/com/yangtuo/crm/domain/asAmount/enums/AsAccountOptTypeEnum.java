package com.yangtuo.crm.domain.asAmount.enums;

/**
 * 服务人员余额操作类型
 *
 * @author 木鸢
 * @create by 2018-05-21 16:57
 */
public enum AsAccountOptTypeEnum {

    ADD(1, "增加"),
    SUB(2, "扣减");

    private Integer code;

    private String desc;

    AsAccountOptTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static AsAccountOptTypeEnum getByOptType(Integer optType) {
        if (null == optType) {
            return null;
        }
        for (AsAccountOptTypeEnum optTypeEnum : AsAccountOptTypeEnum.values()) {
            if (optType.equals(optTypeEnum.getCode())) {
                return optTypeEnum;
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
