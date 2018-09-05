package com.yangtuo.crm.domain.shopServerLog;

import com.yangtuo.crm.domain.base.CrmBaseQuery;
import java.util.List;

/**
 * 服务人员门店出入库查询模型
 *
 * @author 栋
 * @create by 2018-06-06 上午10:03
 */
public class ShopServerLogQuery extends CrmBaseQuery{

    private int tabType;
    /**
     * 出入库开始时间
     */
    private String timeStart;
    /**
     * 出入库截至时间
     */
    private String timeEnd;
    /**
     * 出入库类型
     */
    private Integer putType;
    /**
     * 门店id
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 出入库阶段
     */
    private Integer shopPutStage;
    /**
     * 查询用户的userId集合
     */
    private List<String> userIdList;
    /**
     * 部门id
     */
    private Long deptId;
    /**
     * 当前登录用户的userId
     */
    private String loginUserId;

    public String getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId;
    }

    public int getTabType() {
        return tabType;
    }

    public void setTabType(int tabType) {
        this.tabType = tabType;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Integer getPutType() {
        return putType;
    }

    public void setPutType(Integer putType) {
        this.putType = putType;
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

    public Integer getShopPutStage() {
        return shopPutStage;
    }

    public void setShopPutStage(Integer shopPutStage) {
        this.shopPutStage = shopPutStage;
    }

    public List<String> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
