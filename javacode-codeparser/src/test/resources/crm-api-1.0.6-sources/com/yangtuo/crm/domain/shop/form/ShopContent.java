package com.yangtuo.crm.domain.shop.form;

public enum ShopContent {
    group("group", "门店分组"),
    afterServer("afterServer", "服务人员"),
    linker("linker", "联系人"),
    tradeInfo("tradeInfo", "交易信息"),//交易主要模型  ShopMainTradeTo.class
    qualication("qualication", "资质"),
    contract("contract", "拜访信息"),
    extend("extend", "扩展信息"),
    sell("sell", "商城相关"),
    parentshop("parentshop", "总店");

    String code;
    String desc;

    ShopContent(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ShopContent getByCode(String code) {
        if (null == code) {
            return null;
        }
        for (ShopContent serverDataTypeEnum : ShopContent.values()) {
            if (serverDataTypeEnum.getCode().equals(code)) {
                return serverDataTypeEnum;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
