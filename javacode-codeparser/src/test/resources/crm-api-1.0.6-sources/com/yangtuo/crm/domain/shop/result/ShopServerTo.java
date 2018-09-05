package com.yangtuo.crm.domain.shop.result;


/**
 * 门店服务人员
 *
 * @author 木鸢
 * @create 2017-04-02 下午 8:05
 */
public class ShopServerTo {

    /**
     * 服务人员userId
     */
    private String afterServer;

    /**
     * 服务人员名称
     */
    private String afterServerName;
    /**
     * 服务人员类型文案展示
     */
    private String afterServerTypeName;
    /**
     * 服务人员电话
     */
    private String afterServerPhone;
    /**
     * 显示顺序
     */
    private Integer displayIndex;
    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 入库时间
     */
    private String inputTime;

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime;
    }

    public String getAfterServer() {
        return afterServer;
    }

    public void setAfterServer(String afterServer) {
        this.afterServer = afterServer;
    }

    public String getAfterServerName() {
        return afterServerName;
    }

    public void setAfterServerName(String afterServerName) {
        this.afterServerName = afterServerName;
    }

    public String getAfterServerTypeName() {
        return afterServerTypeName;
    }

    public void setAfterServerTypeName(String afterServerTypeName) {
        this.afterServerTypeName = afterServerTypeName;
    }

    public String getAfterServerPhone() {
        return afterServerPhone;
    }

    public void setAfterServerPhone(String afterServerPhone) {
        this.afterServerPhone = afterServerPhone;
    }

    public Integer getDisplayIndex() {
        return displayIndex;
    }

    public void setDisplayIndex(Integer displayIndex) {
        this.displayIndex = displayIndex;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
