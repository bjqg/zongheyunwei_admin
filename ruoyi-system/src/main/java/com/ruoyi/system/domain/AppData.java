package com.ruoyi.system.domain;

import com.ruoyi.system.domain.vo.AppDataVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 综合运维数据定义对象 app_data
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@ApiModel(value = "综合运维数据定义对象 app_data")
public class AppData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @ApiModelProperty(value = "综合运维数据定义id",example = "1L")
    private Long id;

    /** 应用id */
    @Excel(name = "应用id")
    @ApiModelProperty(value = "应用id",example = "1")
    private Integer appId;

    /** 执行操作名称 */
    @Excel(name = "执行操作名称")
    @ApiModelProperty(value = "执行操作名称",example = "insert")
    private String action;

    /** 执行参数 */
    @Excel(name = "执行参数")
    @ApiModelProperty(value = "执行参数",example = "username=admin,password=Admin")
    private String param;

    /** 数据值 */
    @Excel(name = "数据值")
    @ApiModelProperty(value = "数据值",example = "{'服务器名称':'综合楼交换机1'}")
    private String val;

    /** 数据状态 0：正常 1：下线 */
    @Excel(name = "数据状态 0：正常 1：下线")
    @ApiModelProperty(value = "数据状态",example = "0：正常 1：下线")
    private Integer status;

    /** 数据名称 */
    @Excel(name = "数据名称")
    @ApiModelProperty(value = "数据名称",example = "zcgk")
    private String name;

    /** 跳转名称 */
    @Excel(name = "跳转地址")
    @ApiModelProperty(value = "跳转地址",example = "www.baidu.com")
    private String url;

    /** 数据描述 */
    @Excel(name = "数据描述")
    @ApiModelProperty(value = "数据描述",example = "资产管控的列表数据")
    private String desc;

    /** 数据样例 */
    @Excel(name = "数据样例")
    @ApiModelProperty(value = "数据样例",example = "{'设备类型':'服务器'，'设备名称':'综合楼xxx'，'健康值':'0.00%'，'当前异常':'警告'，'响应时间':'2毫秒'，'cpu':'88%'， 'mem':'14%'，'xxx':'xxx'}")
    private String demo;

    /** 数据定义 **/
    @ApiModelProperty(value = "数据定义",dataType = "AppDataVo")
    private AppDataVo appDataVo;

    public AppDataVo getAppDataVo() {
        return appDataVo;
    }

    public void setAppDataVo(AppDataVo appDataVo) {
        this.appDataVo = appDataVo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

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
    public void setAction(String action)
    {
        this.action = action;
    }

    public String getAction()
    {
        return action;
    }
    public void setParam(String param)
    {
        this.param = param;
    }

    public String getParam()
    {
        return param;
    }
    public void setStatus(Integer status)
    {
        this.status = status;
    }

    public Integer getStatus()
    {
        return status;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setDesc(String desc)
    {
        this.desc = desc;
    }

    public String getDesc()
    {
        return desc;
    }
    public void setDemo(String demo)
    {
        this.demo = demo;
    }

    public String getDemo()
    {
        return demo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appId", getAppId())
            .append("action", getAction())
            .append("param", getParam())
            .append("val",getVal())
            .append("status", getStatus())
            .append("name", getName())
            .append("url",getUrl())
            .append("desc", getDesc())
            .append("demo", getDemo())
            .append("appDataVo",getAppDataVo())
            .toString();
    }


}
