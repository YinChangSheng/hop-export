package com.yangtuo.crm.domain.worktask.to;

import java.io.Serializable;

/**
 * 获取工单处理意见
 * @author 阿健
 * @create 2018-04-27 17:52
 */
public class WorkDealSuggestionTO implements Serializable {


    private static final long serialVersionUID = 8332113149207513824L;

    /**
     * 意见人名称
     */
    private String suggestionUserName;

    /**
     * 意见内容
     */
    private String suggestionContent;

    /**
     * 日期
     */
    private String date;

    /**
     * 意见
     */
    private String suggestion;

    /**
     * 颜色状态
     */
    private String colorStatus;

    public String getColorStatus() {
        return colorStatus;
    }

    public void setColorStatus(String colorStatus) {
        this.colorStatus = colorStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSuggestionUserName() {
        return suggestionUserName;
    }

    public void setSuggestionUserName(String suggestionUserName) {
        this.suggestionUserName = suggestionUserName;
    }

    public String getSuggestionContent() {
        return suggestionContent;
    }

    public void setSuggestionContent(String suggestionContent) {
        this.suggestionContent = suggestionContent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
