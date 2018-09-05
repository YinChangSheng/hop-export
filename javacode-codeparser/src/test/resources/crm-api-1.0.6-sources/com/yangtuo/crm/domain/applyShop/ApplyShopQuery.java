package com.yangtuo.crm.domain.applyShop;

import com.yangtuo.crm.domain.base.CrmBaseQuery;

import java.util.List;

/**
 * @author Created by diandian on 2018/4/8.
 */
public class ApplyShopQuery extends CrmBaseQuery{
    /**
     * 门店id
     */
    String shopId;

    private List<String> shopIdList;

    private Integer deptId;

    /**
     * 门店名称模糊查询
     */
    String shopName;
    /**
     * 省份ID
     */
    String provinceId;
    /**
     * 城市
     */
    String cityId;
    /**
     * 区域id
     */
    String areaId;

    /**
     * <p>商机来源(@link ApplyShopTypeEnum,1, "销售拜访"、2, "自主加盟"、3, "客服录入"、4, "门店邀请")</p>
     * <p><b>备注：老版本仅支持单个查询</b></p>
     */
    private Integer            type;

    /**
     * <p>商机来源(@link ApplyShopTypeEnum,1, "销售拜访"、2, "自主加盟"、3, "客服录入"、4, "门店邀请")</p>
     * <p><b>备注：新版本支持多选，逗号分隔</b></p>
     */
    private List<Integer>             types;

    /**
     * bd
     */
    String afterServer;
    //兼容crmapp端，多个驻地查询
    List<String> afterServers;
    /**
     * 状态  此处只用 开户/未开户 （合作/未合作）
     */
    Integer status;

    /**
     * 标注情况(查询经纬度是否为空，1标注 2未标注)
     */
    Integer hasMarked;

    /**
     * 客户端用户实时纬度
     */
    String latitude = "0";

    /**
     * 客户端用户的实时经度
     */
    String longitude = "0";

    /**
     * 排序字段:1 时间倒序，2 距离近到远
     */
    Integer sortType;

    /**
     * 是否已指派售后服务人员
     */
    Integer assigned;
    /**
     * 是否已添加拜访记录  YN   0,1
     */
    Integer visited;
    /**
     * 管辖的省份列表
     * 如果设置则只能查询列表中的省份
     */
    List<String> provinceList;

    List<String> cityIdList;

    List<String> areaIdList;

    /**
     * 创建时间区间查询
     */
    String createTimeStart;
    String createTimeEnd;

    /**
     * 入库时间区域查询
     */
    String inputTimeStart;
    String inputTimeEnd;

    /**
     * <p>商机状态(待首次联系1 待跟进2 已合作3 暂不合作4 待分配5)</p>
     * <p><b>备注：老版本仅支持单个查询</b></p>
     */
    private Integer            applyShopStatus;

    /**
     * <p>商机状态(待首次联系1 待跟进2 已合作3 暂不合作4 待分配5)</p>
     * <p><b>备注：新版本支持多选，逗号分隔</b></p>
     */
    private List<Integer>             applyShopsStatus;


    /*
     * 门店编号
     */
    private String            shopNum;

    /*
    * 门店电话
    */
    private String            shopPhone;


    /**
     * 所有商机      :1
     * 直接管辖商机   :2
     * 我的商机   :3
     */
    Integer searchType = 1;

    /**
     * 门店成熟度
     *  A已注册并下单
     *  B已注册未下单
     *  C有意愿合作
     *  D意愿不明确
     *  E无意愿客户
     *  F不具备合作条件
     *  G空
     */
    Integer maturity;

    String loginUserId;

    /**
     * 联系人姓名
     */
    private String linkerName;

    public List<String> getCityIdList() {
        return cityIdList;
    }

    public void setCityIdList(List<String> cityIdList) {
        this.cityIdList = cityIdList;
    }

    public List<String> getAreaIdList() {
        return areaIdList;
    }

    public void setAreaIdList(List<String> areaIdList) {
        this.areaIdList = areaIdList;
    }

    public String getLinkerName() {
        return linkerName;
    }

    public void setLinkerName(String linkerName) {
        this.linkerName = linkerName;
    }

    public String getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId;
    }

    public void setShopIdList(List<String> shopIdList) {
        this.shopIdList = shopIdList;
    }

    public List<String> getShopIdList() {

        return shopIdList;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public List<String> getAfterServers() {
        return afterServers;
    }

    public void setAfterServers(List<String> afterServers) {
        this.afterServers = afterServers;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }

    public Integer getApplyShopStatus() {
        return applyShopStatus;
    }

    public void setApplyShopStatus(Integer applyShopStatus) {
        this.applyShopStatus = applyShopStatus;
    }

    public String getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public String getAfterServer() {
        return afterServer;
    }

    public void setAfterServer(String afterServer) {
        this.afterServer = afterServer;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public Integer getAssigned() {
        return assigned;
    }

    public void setAssigned(Integer assigned) {
        this.assigned = assigned;
    }

    public List<String> getProvinceList() {
        return provinceList;
    }

    public void setProvinceList(List<String> provinceList) {
        this.provinceList = provinceList;
    }

    public Integer getHasMarked() {
        return hasMarked;
    }

    public void setHasMarked(Integer hasMarked) {
        this.hasMarked = hasMarked;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType = sortType;
    }

    public List<Integer> getApplyShopsStatus() {
        return applyShopsStatus;
    }

    public void setApplyShopsStatus(List<Integer> applyShopsStatus) {
        this.applyShopsStatus = applyShopsStatus;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public void setTypes(List<Integer> types) {
        this.types = types;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getMaturity() {
        return maturity;
    }

    public void setMaturity(Integer maturity) {
        this.maturity = maturity;
    }

    public String getInputTimeStart() {
        return inputTimeStart;
    }

    public void setInputTimeStart(String inputTimeStart) {
        this.inputTimeStart = inputTimeStart;
    }

    public String getInputTimeEnd() {
        return inputTimeEnd;
    }

    public void setInputTimeEnd(String inputTimeEnd) {
        this.inputTimeEnd = inputTimeEnd;
    }
}
