package com.ruoyi.system.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 接入的应用对象 app
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@ApiModel(value = "接入的应用对象app")
public class App extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 应用id */
    @ApiModelProperty(value = "应用id",example = "1L")
    private Long id;

    /** 授权key_ */
    @Excel(name = "授权key_")
    @ApiModelProperty(value = "授权的key",example = "abcdefg")
    private String key;

    /** 应用缩写词 */
    @Excel(name = "应用缩写词")
    @ApiModelProperty(value = "应用缩写名称",example = "wgwl")
    private String acronym;

    /** 应用名称 */
    @Excel(name = "应用名称")
    @ApiModelProperty(value = "应用名称",example = "违规外联")
    private String name;

    /** 应用状态，0：正常 1：禁用（下线） */
    @Excel(name = "应用状态，0：正常 1：禁用", readConverterExp = "下=线")
    @ApiModelProperty(value = "应用状态",example = "0：正常 1：禁用（下线）")
    private Integer status;

    /** 应用描述 */
    @Excel(name = "应用描述")
    @ApiModelProperty(name = "应用描述",example = "融至兴违规外联平台")
    private String desc;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setKey(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }
    public void setAcronym(String acronym)
    {
        this.acronym = acronym;
    }

    public String getAcronym()
    {
        return acronym;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getDesc()
    {
        return desc;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("key", getKey())
            .append("acronym", getAcronym())
            .append("name", getName())
            .append("status", getStatus())
            .append("desc", getDesc())
            .toString();
    }
}
