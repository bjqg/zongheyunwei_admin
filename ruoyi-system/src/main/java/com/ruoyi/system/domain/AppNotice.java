package com.ruoyi.system.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 通知公告对象 app_notice
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@ApiModel(value = "通知公告对象 app_notice")
public class AppNotice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 公告ID */
    @ApiModelProperty(value = "公告ID",example = "1L")
    private Integer noticeId;

    /** 应用id */
    @Excel(name = "应用id")
    @ApiModelProperty(value = "应用id",example = "1")
    private Integer appId;

    /** 公告标题 */
    @Excel(name = "公告标题")
    @ApiModelProperty(value = "公告标题",example = "温馨提醒：2018-07-01 Rzx新版本发布啦")
    private String title;

    /** 公告类型（1通知 2公告） */
    @Excel(name = "公告类型", readConverterExp = "1=通知,2=公告")
    @ApiModelProperty(value = "公告类型",example = "1=通知,2=公告")
    private String type;

    /** 公告内容 */
    @Excel(name = "公告内容")
    @ApiModelProperty(value = "公告内容",example = "公告的具体内容")
    private String content;

    /** 公告状态（0正常 1关闭） */
    @Excel(name = "公告状态", readConverterExp = "0=正常,1=关闭")
    @ApiModelProperty(value = "公告状态",example = "0=正常,1=关闭")
    private String status;

    public void setNoticeId(Integer noticeId)
    {
        this.noticeId = noticeId;
    }

    public Integer getNoticeId()
    {
        return noticeId;
    }
    public void setAppId(Integer appId)
    {
        this.appId = appId;
    }

    public Integer getAppId()
    {
        return appId;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("noticeId", getNoticeId())
            .append("appId", getAppId())
            .append("title", getTitle())
            .append("type", getType())
            .append("content", getContent())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
