package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 应用授权信息对象 app_auth_token
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@ApiModel(value = "应用授权信息对象 app_auth_token")
public class AppAuthToken extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @ApiModelProperty(value = "应用授权信息id",example = "1L")
    private Long id;

    /** 应用id */
    @Excel(name = "应用id")
    @ApiModelProperty(value = "应用id",example = "1")
    private Integer appId;

    /** 授权token */
    @Excel(name = "授权token")
    @ApiModelProperty(value = "授权token",example = "Bearer eyJhbGciOiJIUzUxMiJ9.eyJsb2dpbl91c2VyX2tleSI6IjY4NGVkNjczLWExMzYtNDVjOS04NzlhLTFmNmJhNmYxMjNkMyJ9.nFQEiSloYbsx2iW-hkHN4Y6OyLCNfSl19uao_qS56RfQctt0zQGPztrsoJ5_hqcqy2AAXoiIFkLfIp-rBllYyg")
    private String token;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "创建时间",example = "yyyy-MM-dd")
    private Date cTime;

    /** dead time 失效时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "dead time 失效时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "失效时间",example = "yyyy-MM-dd")
    private Date dTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setAppId(Integer appId)
    {
        this.appId = appId;
    }

    public Integer getAppId()
    {
        return appId;
    }
    public void setToken(String token)
    {
        this.token = token;
    }

    public String getToken()
    {
        return token;
    }
    public void setcTime(Date cTime)
    {
        this.cTime = cTime;
    }

    public Date getcTime()
    {
        return cTime;
    }
    public void setdTime(Date dTime)
    {
        this.dTime = dTime;
    }

    public Date getdTime()
    {
        return dTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appId", getAppId())
            .append("token", getToken())
            .append("cTime", getcTime())
            .append("dTime", getdTime())
            .toString();
    }
}
