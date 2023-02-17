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
import com.ruoyi.system.domain.AppProblem;
import com.ruoyi.system.service.IAppProblemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 告警信息（默认保存15天信息）Controller
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@Api(tags = "告警信息")
@RestController
@RequestMapping("/system/problem")
public class AppProblemController extends BaseController
{
    @Autowired
    private IAppProblemService appProblemService;

    /**
     * 查询告警信息（默认保存15天信息）列表
     */
    @PreAuthorize("@ss.hasPermi('system:problem:list')")
    @ApiOperation(value = "查询告警信息",notes = "传入AppProblem实体类")
    @GetMapping("/list")
    public TableDataInfo list(AppProblem appProblem)
    {
        startPage();
        List<AppProblem> list = appProblemService.selectAppProblemList(appProblem);
        return getDataTable(list);
    }

    /**
     * 导出告警信息（默认保存15天信息）列表
     */
    @PreAuthorize("@ss.hasPermi('system:problem:export')")
    @Log(title = "告警信息（默认保存15天信息）", businessType = BusinessType.EXPORT)
    @ApiOperation(value = "导出告警信息",notes = "传入响应头和AppProblem实体类")
    @PostMapping("/export")
    public void export(HttpServletResponse response, AppProblem appProblem)
    {
        List<AppProblem> list = appProblemService.selectAppProblemList(appProblem);
        ExcelUtil<AppProblem> util = new ExcelUtil<AppProblem>(AppProblem.class);
        util.exportExcel(response, list, "告警信息（默认保存15天信息）数据");
    }

    /**
     * 获取告警信息（默认保存15天信息）详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:problem:query')")
    @ApiOperation(value = "获取告警信息",notes = "传入id")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(appProblemService.selectAppProblemById(id));
    }

    /**
     * 新增告警信息（默认保存15天信息）
     */
    @PreAuthorize("@ss.hasPermi('system:problem:add')")
    @Log(title = "告警信息（默认保存15天信息）", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增告警信息",notes = "AppProblem实体类,json格式")
    @PostMapping
    public AjaxResult add(@RequestBody AppProblem appProblem)
    {
        return toAjax(appProblemService.insertAppProblem(appProblem));
    }

    /**
     * 修改告警信息（默认保存15天信息）
     */
    @PreAuthorize("@ss.hasPermi('system:problem:edit')")
    @Log(title = "告警信息（默认保存15天信息）", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改告警信息",notes = "AppProblem实体类,json格式")
    @PutMapping
    public AjaxResult edit(@RequestBody AppProblem appProblem)
    {
        return toAjax(appProblemService.updateAppProblem(appProblem));
    }

    /**
     * 删除告警信息（默认保存15天信息）
     */
    @PreAuthorize("@ss.hasPermi('system:problem:remove')")
    @Log(title = "告警信息（默认保存15天信息）", businessType = BusinessType.DELETE)
    @ApiOperation(value = "删除告警信息",notes = "传入ids,可多传")
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(appProblemService.deleteAppProblemByIds(ids));
    }
}
