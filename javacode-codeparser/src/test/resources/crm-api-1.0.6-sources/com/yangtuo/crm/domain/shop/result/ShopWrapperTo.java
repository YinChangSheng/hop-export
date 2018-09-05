package com.yangtuo.crm.domain.shop.result;

import com.yangtuo.crm.domain.publicsea.to.PublicSeaShopTO;

import java.io.Serializable;
import java.util.List;

/**
 * 门店业务模型包装类
 *
 * @author 木鸢
 * create by2018-04-03 14:54
 */
public class ShopWrapperTo implements Serializable {

    private static final long serialVersionUID = -8118405269575674268L;

    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 门店基础模型
     */
    private CrmShopTo shopTo;

    /**
     * 门店交易模型
     */
    private ShopMainTradeTo shopTradeTo;
    /**
     * 门店资质模型
     */
    private ShopQualificationTo shopQualificationTo;

    /**
     * 联系人
     */
    private List<CrmLinkerTo> linkers;

    /**
     * 门店服务人员
     */
    private List<ShopServerTo> shopServers;

    /**
     * 门店拜访联系模型
     */
    private ShopContractTo shopContractTo;

    /**
     * 扩展模型
     */
    private ShopExtendTo shopExtendTo;

    /**
     * 门店前台mall相关模型
     */
    private ShopSellTo shopSellTo;

    /**
     * 总店模型
     */
    private ShopParentTo shopParentTo;

    /**
     * 公海模型
     */
    private PublicSeaShopTO publicSeaShopTO;

    /**
     * to App 视图逻辑模型
     */
    private CrmAppViewTo appViewTo;

    /**
     * HI卡余额
     */
    private Long hiCardBalance;

    public Long getHiCardBalance() {
        return hiCardBalance;
    }

    public void setHiCardBalance(Long hiCardBalance) {
        this.hiCardBalance = hiCardBalance;
    }

    public ShopParentTo getShopParentTo() {
        return shopParentTo;
    }

    public void setShopParentTo(ShopParentTo shopParentTo) {
        this.shopParentTo = shopParentTo;
    }

    public ShopSellTo getShopSellTo() {
        return shopSellTo;
    }

    public void setShopSellTo(ShopSellTo shopSellTo) {
        this.shopSellTo = shopSellTo;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public CrmShopTo getShopTo() {
        return shopTo;
    }

    public void setShopTo(CrmShopTo shopTo) {
        this.shopTo = shopTo;
    }

    public ShopMainTradeTo getShopTradeTo() {
        return shopTradeTo;
    }

    public void setShopTradeTo(ShopMainTradeTo shopTradeTo) {
        this.shopTradeTo = shopTradeTo;
    }

    public ShopQualificationTo getShopQualificationTo() {
        return shopQualificationTo;
    }

    public void setShopQualificationTo(ShopQualificationTo shopQualificationTo) {
        this.shopQualificationTo = shopQualificationTo;
    }

    public List<CrmLinkerTo> getLinkers() {
        return linkers;
    }

    public void setLinkers(List<CrmLinkerTo> linkers) {
        this.linkers = linkers;
    }

    public List<ShopServerTo> getShopServers() {
        return shopServers;
    }

    public void setShopServers(List<ShopServerTo> shopServers) {
        this.shopServers = shopServers;
    }

    public ShopContractTo getShopContractTo() {
        return shopContractTo;
    }

    public void setShopContractTo(ShopContractTo shopContractTo) {
        this.shopContractTo = shopContractTo;
    }

    public ShopExtendTo getShopExtendTo() {
        return shopExtendTo;
    }

    public PublicSeaShopTO getPublicSeaShopTO() {
        return publicSeaShopTO;
    }

    public void setPublicSeaShopTO(PublicSeaShopTO publicSeaShopTO) {
        this.publicSeaShopTO = publicSeaShopTO;
    }

    public void setShopExtendTo(ShopExtendTo shopExtendTo) {
        this.shopExtendTo = shopExtendTo;
    }

    public CrmAppViewTo getAppViewTo() {
        return appViewTo;
    }

    public void setAppViewTo(CrmAppViewTo appViewTo) {
        this.appViewTo = appViewTo;
    }
}
