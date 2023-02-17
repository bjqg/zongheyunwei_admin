package com.ruoyi.web.controller.app;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.AppAuthToken;
import com.ruoyi.system.service.IAppAuthTokenService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 应用授权信息Controller
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@Api(tags = "应用授权信息")
@RestController
@RequestMapping("/system/token")
public class AppAuthTokenController extends BaseController
{
    @Autowired
    private IAppAuthTokenService appAuthTokenService;

    /**
     * 查询应用授权信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:token:list')")
    @ApiOperation(value = "查询应用授权信息列表",notes = "返回表格分页数据对象")
    @GetMapping("/list")
    public TableDataInfo list(AppAuthToken appAuthToken)
    {
        startPage();
        List<AppAuthToken> list = appAuthTokenService.selectAppAuthTokenList(appAuthToken);
        return getDataTable(list);
    }

    /**
     * 导出应用授权信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:token:export')")
    @Log(title = "应用授权信息", businessType = BusinessType.EXPORT)
    @ApiOperation(value = "导出应用授权信息列表",notes = "导出excel表格数据")
    @PostMapping("/export")
    public void export(HttpServletResponse response, AppAuthToken appAuthToken)
    {
        List<AppAuthToken> list = appAuthTokenService.selectAppAuthTokenList(appAuthToken);
        ExcelUtil<AppAuthToken> util = new ExcelUtil<AppAuthToken>(AppAuthToken.class);
        util.exportExcel(response, list, "应用授权信息数据");
    }

    /**
     * 获取应用授权信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:token:query')")
    @ApiOperation(value = "获取应用授权信息详细信息",notes = "传人id，返回详细信息")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(appAuthTokenService.selectAppAuthTokenById(id));
    }

    /**
     * 新增应用授权信息
     */
    @PreAuthorize("@ss.hasPermi('system:token:add')")
    @Log(title = "应用授权信息", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增应用授权信息",notes = "传入AppAuthToken实体类的属性,json类型")
    @PostMapping
    public AjaxResult add(@RequestBody AppAuthToken appAuthToken)
    {
        return toAjax(appAuthTokenService.insertAppAuthToken(appAuthToken));
    }

    /**
     * 修改应用授权信息
     */
    @PreAuthorize("@ss.hasPermi('system:token:edit')")
    @Log(title = "应用授权信息", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改应用授权信息",notes = "传入AppAuthToken实体类属性,json类型")
    @PutMapping
    public AjaxResult edit(@RequestBody AppAuthToken appAuthToken)
    {
        return toAjax(appAuthTokenService.updateAppAuthToken(appAuthToken));
    }

    /**
     * 删除应用授权信息
     */
    @PreAuthorize("@ss.hasPermi('system:token:remove')")
    @Log(title = "应用授权信息", businessType = BusinessType.DELETE)
    @ApiOperation(value = "删除应用授权信息",notes = "传入ids、可传多个")
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appAuthTokenService.deleteAppAuthTokenByIds(ids));
    }
}
