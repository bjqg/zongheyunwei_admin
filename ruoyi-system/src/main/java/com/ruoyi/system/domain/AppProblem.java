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
 * 告警信息（默认保存15天信息）对象 app_problem
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@ApiModel(value = "告警信息（默认保存15天信息）对象 app_problem")
public class AppProblem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @ApiModelProperty(value = "告警信息id",example = "1L")
    private Long id;

    /** 应用id */
    @Excel(name = "应用id")
    @ApiModelProperty(value = "应用id",example = "1")
    private Integer appId;

    /** 系统内部id */
    @Excel(name = "系统内部id")
    @ApiModelProperty(value = "系统内部id",example = "1")
    private Long sourceId;

    /** 告警等级 */
    @Excel(name = "告警等级")
    @ApiModelProperty(value = "告警等级",example = "1")
    private Integer level;

    /** 告警描述 */
    @Excel(name = "告警描述")
    @ApiModelProperty(value = "告警描述",example = "交换机告警")
    private String desc;

    /** 主机信息 */
    @Excel(name = "主机信息")
    @ApiModelProperty(value = "主机名称",example = "综合楼交换机")
    private String hostName;

    /** 主机ip */
    @Excel(name = "主机ip")
    @ApiModelProperty(value = "主机ip",example = "127.0.0.1")
    private String hostIp;

    /** 主机mac 地址 */
    @Excel(name = "主机mac 地址")
    @ApiModelProperty(value = "主机mac地址",example = "127.0.0.1")
    private String hostMac;

    /** 设备位置 */
    @Excel(name = "设备位置")
    @ApiModelProperty(value = "设备位置",example = "设备的具体位置")
    private String hostLocation;

    /** 发生时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发生时间", width = 30, dateFormat = "yyyy-MM-dd")
    @ApiModelProperty(value = "发生时间",example = "yyyy-MM-dd")
    private Date cTime;

    /** 告警状态 */
    @Excel(name = "告警状态")
    @ApiModelProperty(value = "告警状态",example = "0")
    private Integer status;

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
    public void setSourceId(Long sourceId)
    {
        this.sourceId = sourceId;
    }

    public Long getSourceId()
    {
        return sourceId;
    }
    public void setLevel(Integer level)
    {
        this.level = level;
    }

    public Integer getLevel()
    {
        return level;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getDesc()
    {
        return desc;
    }
    public void setHostName(String hostName)
    {
        this.hostName = hostName;
    }

    public String getHostName()
    {
        return hostName;
    }
    public void setHostIp(String hostIp)
    {
        this.hostIp = hostIp;
    }

    public String getHostIp()
    {
        return hostIp;
    }
    public void setHostMac(String hostMac)
    {
        this.hostMac = hostMac;
    }

    public String getHostMac()
    {
        return hostMac;
    }
    public void setHostLocation(String hostLocation)
    {
        this.hostLocation = hostLocation;
    }

    public String getHostLocation()
    {
        return hostLocation;
    }
    public void setcTime(Date cTime)
    {
        this.cTime = cTime;
    }

    public Date getcTime()
    {
        return cTime;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appId", getAppId())
            .append("sourceId", getSourceId())
            .append("level", getLevel())
            .append("desc", getDesc())
            .append("hostName", getHostName())
            .append("hostIp", getHostIp())
            .append("hostMac", getHostMac())
            .append("hostLocation", getHostLocation())
            .append("cTime", getcTime())
            .append("status", getStatus())
            .toString();
    }
}
