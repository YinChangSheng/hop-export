package com.yangtuo.crm.domain.asAmount.enums;


/**
 * 服务人员余额操作场景
 *
 * @author 木鸢
 * @create by 2018-05-21 16:57
 */
public enum AsAccountSceneEnum {

    OPERATOR_SUPPORT_SALE(1, "尤妮佳项目专用"),
    SILENT_ACTIVATION(2, "静默激活"),
    B_TO_A_ALLOWANCE(3, "A类补贴"),
    ADJUST(0, "人工调整");

    private Integer code;

    private String desc;


    AsAccountSceneEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public static AsAccountSceneEnum getBySceneType(Integer sceneType) {
        if (null == sceneType) {
            return null;
        }
        for (AsAccountSceneEnum sceneEnum : AsAccountSceneEnum.values()) {
            if (sceneType.equals(sceneEnum.getCode())) {
                return sceneEnum;
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
