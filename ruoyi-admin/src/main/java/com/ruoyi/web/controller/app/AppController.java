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
import com.ruoyi.system.domain.App;
import com.ruoyi.system.service.IAppService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 接入的应用Controller
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@Api(tags = "接入的应用")
@RestController
@RequestMapping("/system/app")
public class AppController extends BaseController
{
    @Autowired
    private IAppService appService;

    /**
     * 查询接入的应用列表
     */
    @PreAuthorize("@ss.hasPermi('system:app:list')")
    @ApiOperation(value = "查询接入的应用列表",notes = "返回表格分页数据对象")
    @GetMapping("/list")
    public TableDataInfo list(App app)
    {
        startPage();
        List<App> list = appService.selectAppList(app);
        return getDataTable(list);
    }

    /**
     * 导出接入的应用列表
     */
    @PreAuthorize("@ss.hasPermi('system:app:export')")
    @Log(title = "接入的应用", businessType = BusinessType.EXPORT)
    @ApiOperation(value = "导出接入的应用列表",notes = "导出excel表格")
    @PostMapping("/export")
    public void export(HttpServletResponse response, App app)
    {
        List<App> list = appService.selectAppList(app);
        ExcelUtil<App> util = new ExcelUtil<App>(App.class);
        util.exportExcel(response, list, "接入的应用数据");
    }

    /**
     * 获取接入的应用详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:app:query')")
    @ApiOperation(value = "获取接入的应用详细信息",notes = "传入id，获取详细信息")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(appService.selectAppById(id));
    }

    /**
     * 新增接入的应用
     */
    @PreAuthorize("@ss.hasPermi('system:app:add')")
    @Log(title = "接入的应用", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增接入的应用",notes = "传入App实体类的属性,json类型")
    @PostMapping
    public AjaxResult add(@RequestBody App app)
    {
        return toAjax(appService.insertApp(app));
    }

    /**
     * 修改接入的应用
     */
    @PreAuthorize("@ss.hasPermi('system:app:edit')")
    @Log(title = "接入的应用", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改接入的应用",notes = "传入App实体类的属性,json类型")
    @PutMapping
    public AjaxResult edit(@RequestBody App app)
    {
        return toAjax(appService.updateApp(app));
    }

    /**
     * 删除接入的应用
     */
    @PreAuthorize("@ss.hasPermi('system:app:remove')")
    @Log(title = "接入的应用", businessType = BusinessType.DELETE)
    @ApiOperation(value = "删除接入的应用",notes = "传入ids，可多个")
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appService.deleteAppByIds(ids));
    }
}
