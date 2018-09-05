package com.yangtuo.crm.domain.shop.enums;

public enum ShopQualificationUpdatorEnums {
    ADMIN(1, "专员"),
    OTHER(2, "专员"),;
    private Integer code;
    private String desc;

    ShopQualificationUpdatorEnums(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
