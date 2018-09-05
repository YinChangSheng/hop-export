package com.yangtuo.crm.domain.shop.enums;

import com.yangtuo.crm.domain.shop.result.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * 门店成长体系等级枚举
 *
 * @author 木鸢
 * create by2018-04-03 10:28
 */
public enum ShopGrowingUpLevelEnums {
    // 废弃不再使用
    OTHER(0, "新建无等级"),
    NORMAL_SHOP(1, "普通门店"),
    SENIOR_SHOP(2, "高级门店"),
    VIP_SHOP(3, "VIP门店");

    private int code;
    private String desc;

    ShopGrowingUpLevelEnums(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ShopGrowingUpLevelEnums getShopStateEnums(int code) {
        for (ShopGrowingUpLevelEnums status : values()) {
            if (code == status.getCode()) {
                return status;
            }
        }
        return null;
    }

    public static String getDesc(int code) {
        for (ShopGrowingUpLevelEnums status : values()) {
            if (code == status.getCode()) {
                return status.getDesc();
            }
        }

        return "";
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static List<Pair> list() {
        List<Pair> pairs = new ArrayList<>();
        for (ShopGrowingUpLevelEnums enums : ShopGrowingUpLevelEnums.values()) {
            Pair pair = new Pair();
            pair.setK(String.valueOf(enums.getCode()));
            pair.setV(enums.getDesc());
            pairs.add(pair);
        }
        return pairs;
    }
}
