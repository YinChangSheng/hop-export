package com.yangtuo.crm.domain.workTable.enums;

public enum RankingTypeEnum {

    DEPARTMENT(1, "部门排行榜"),
    OWN_DEPARTMENT(2, "组内排行榜");

    private Integer code;

    private String desc;

    RankingTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static RankingTypeEnum getRankingTypeEnum(Integer code) {
        for (RankingTypeEnum rankingTypeEnum : RankingTypeEnum.values()) {
            if (rankingTypeEnum.getCode().equals(code)) {
                return rankingTypeEnum;
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
