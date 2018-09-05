package com.yangtuo.crm.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回对象的约定 大家都按照这个模板进行构建， 构造函数明确设置success的值，在success为false的时候必须有message值.
 * 使用models的方式方便多个对象传递时的灵活性，但是默认只应该使用getDefaultModel 和setDefaultModel. Created by wuzheng.yk on 15/7/13.
 *
 * @author 景天
 * @create 2018-01-31 下午 9:31
 */
public class ResultData<T> implements Serializable {

    private static final long   serialVersionUID = 6789607835405733847L;

    public static final String  SUCCESS_CODE     = "200";

    public static final String  FAIL             = "201";

    public static final String  ERROR            = "500";

    private Map<String, String> models           = new HashMap(4);

    private String              message          = "";
    private String              code             = "";

    private T                   data;

    private long                totalCount;

    private long                totalPage;

    public ResultData(){
        this.setCode(SUCCESS_CODE);
    }

    public ResultData(String code){
        this.setCode(code);
    }

    public ResultData(String code, String message){
        this.setCode(code);
        this.setMessage(message);
    }

    /**
     * 取得model对象。
     * <p/>
     * <p>
     * 此调用相当于<code>getModels().get(DEFAULT_MODEL_KEY)</code>。
     * </p>
     *
     * @return model对象
     */
    public T getDefaultModel() {
        return this.data;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 设置model对象。
     * <p/>
     * <p>
     * 此调用相当于<code>getModels().put(DEFAULT_MODEL_KEY, model)</code>。
     * </p>
     *
     * @param model model对象
     */
    public void setDefaultModel(T model) {
        this.data = model;
    }

    public void setModel(String key, String model) {
        models.put(key, model);
    }

    public Map<String, String> getModels() {
        return models;
    }

    public static <T> ResultData<T> writeForSuccess(T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setData(data);
        return resultData;
    }

    public static <T> ResultData<T> writeForError(String msg, T data) {
        ResultData<T> resultData = new ResultData<>();
        resultData.setCode(FAIL);
        resultData.setMessage(msg);
        resultData.setData(data);
        return resultData;
    }

		public static <T> ResultData<T> writeForError(String msg) {
			return writeForError(msg, null);
		}


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /*
     * -------- set and get----------
     */
    public boolean isSuccess() {
        return SUCCESS_CODE.equals(this.getCode());
    }

    public String getMessage() {
        return message;
    }

    public ResultData setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ResultData setCode(String code) {
        this.code = code;
        return this;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }
}
