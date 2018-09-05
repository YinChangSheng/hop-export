package com.yangtuo.crm.domain.shop.form;



import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 门店查询选项
 * @author 木鸢
 * create by 2018-04-10 14:54
 */
public class ShopOption implements Serializable {
    private static final long serialVersionUID = 1L;

    private Set<ShopContent> contents = new HashSet<ShopContent>();

    public static ShopOption getInstance() {
        return new ShopOption();
    }

    public ShopOption include(ShopContent... content) {
        Collections.addAll(contents,content);
        return this;
    }

    public boolean isIncludeAfterServerName(){
        return contents!=null && contents.contains(ShopContent.afterServer);
    }

    public boolean isIncludeLinker(){
        return contents!=null && contents.contains(ShopContent.linker);
    }

    public boolean isIncludeTrade(){
        return contents!=null && contents.contains(ShopContent.tradeInfo);
    }

    public boolean isIncludeQualification(){
        return contents!=null && contents.contains(ShopContent.qualication);
    }
    public boolean isIncludeContract(){
        return contents!=null && contents.contains(ShopContent.contract);
    }

    public boolean isIncludeParentShop(){
        return contents!=null && contents.contains(ShopContent.parentshop);
    }

    public boolean isIncludeSell(){
        return contents!=null && contents.contains(ShopContent.sell);
    }
    public boolean isIncludeExtend(){
        return contents!=null && contents.contains(ShopContent.extend);
    }
}

