package com.yangtuo.crm.api.visit.to;

import java.io.Serializable;

/**
 * 销售拜访TO
 *
 * @author kai.KingS
 * @create by 2018-04-27 下午4:16
 */
public class CrmVisitTO implements Serializable {

    private static final long serialVersionUID = -8088277159003689798L;


    private Long visitId;

    /**
     * 拜访方式；1为有效拜访，2为一般拜访
     */
    private Integer visitMode;

    /**
     * 拜访方式
     */
    private String visitModeStr;

    /**
     * 拜访日期
     */
    private String visitDate;

    /**
     * 拜访时间
     */
    private String visitTime;

    /**
     * 拜访内容
     */
    private String visitContent;

    /**
     * 服务人员
     */
    private String serverName;

    /**
     * 是否关联
     */
    private Boolean isRelated;

    /**
     * 门店图片
     */
    private String picUrl;

    /**
     * 门店图片地址
     */
    private String picPath;

    public Long getVisitId() {
        return visitId;
    }

    public void setVisitId(Long visitId) {
        this.visitId = visitId;
    }

    public Integer getVisitMode() {
        return visitMode;
    }

    public void setVisitMode(Integer visitMode) {
        this.visitMode = visitMode;
    }

    public String getVisitModeStr() {
        return visitModeStr;
    }

    public void setVisitModeStr(String visitModeStr) {
        this.visitModeStr = visitModeStr;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitContent() {
        return visitContent;
    }

    public void setVisitContent(String visitContent) {
        this.visitContent = visitContent;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Boolean getRelated() {
        return isRelated;
    }

    public void setRelated(Boolean related) {
        isRelated = related;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
