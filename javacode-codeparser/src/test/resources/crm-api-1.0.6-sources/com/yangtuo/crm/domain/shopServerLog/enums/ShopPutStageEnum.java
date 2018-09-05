package com.yangtuo.crm.domain.shopServerLog.enums;

public enum ShopPutStageEnum {

    APPLY_SHOP(1,"商机门店"),
    EFFECTIVE_SHOP(2,"有效门店");

    private int code;

    private String desc;

    ShopPutStageEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ShopPutStageEnum getShopPutStageEnumByCode(Integer code){
        if (null == code){
            return null;
        }
        for (ShopPutStageEnum shopPutStageEnum : ShopPutStageEnum.values()){
            if (shopPutStageEnum.getCode() == code) return shopPutStageEnum;
        }
        return null;
    }

}
