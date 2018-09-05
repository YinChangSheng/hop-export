package com.yangtuo.crm.domain.shopServerLog.enums;

public enum TabTypeEnum {

    ALL_LOG(1,"所有人员出入库记录"),
    SUBORDINATE_LOG(2,"下属人员出入库记录"),
    MY_LOG(3,"我的出入库记录"),;

    private int code;

    private String desc;

    TabTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static TabTypeEnum getTabTypeEnumByCode(Integer code){
        if (null == code){
            return null;
        }
        for (TabTypeEnum tabTypeEnum : TabTypeEnum.values()){
            if (tabTypeEnum.getCode() == code) return tabTypeEnum;
        }
        return null;
    }

}
