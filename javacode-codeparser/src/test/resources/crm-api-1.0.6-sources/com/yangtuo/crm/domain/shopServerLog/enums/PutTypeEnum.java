package com.yangtuo.crm.domain.shopServerLog.enums;

public enum PutTypeEnum {

    OUTPUT_STORE(1,"出库"),
    INPUT_STORE(2,"入库");

    private int code;

    private String desc;

    PutTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static PutTypeEnum getPutTypeEnumByCode(Integer code){
        if (null == code){
            return null;
        }
        for (PutTypeEnum putTypeEnum : PutTypeEnum.values()){
            if (putTypeEnum.getCode() == code) return putTypeEnum;
        }
        return null;
    }

}
