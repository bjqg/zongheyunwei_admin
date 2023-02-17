package com.ruoyi.system.domain.vo;

import com.alibaba.fastjson2.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * 三方推送数据
 *
 * @author hui
 * @date 2022/10/17
 */
@ApiModel(value = "三方推送数据")
public class AppDataVo {

    /**
     * 响应状态码
     */
    private String code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 操作名称（数据来源）
     */
    private String action;

    /**
     * 接收的具体数据
     */
    @ApiModelProperty
    private Map<String, Object> data;

    /**
     * 验证token
     */
    private String token;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "AppDataVo{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", action='" + action + '\'' +
                ", data=" + data +
                ", token='" + token + '\'' +
                '}';
    }

    public AppDataVo() {
    }

}
