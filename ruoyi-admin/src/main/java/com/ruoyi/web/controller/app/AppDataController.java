package com.ruoyi.web.controller.app;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.vo.AppDataVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.AppData;
import com.ruoyi.system.service.IAppDataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 综合运维数据定义Controller
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@Api(tags = "综合运维数据定义")
@RestController
@RequestMapping("/system/data")
public class AppDataController extends BaseController {
    @Autowired
    private IAppDataService appDataService;

    /**
     * 查询综合运维数据定义列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:list')")
    @ApiOperation(value = "查询综合运维数据定义列表",notes = "传入AppData实体类属性，返回表格分页数据对象")
    @GetMapping("/list")
    public TableDataInfo list(AppData appData) {
        startPage();
        List<AppData> list = appDataService.selectAppDataList(appData);
        return getDataTable(list);
    }

    /**
     * 导出综合运维数据定义列表
     */
    @PreAuthorize("@ss.hasPermi('system:data:export')")
    @Log(title = "综合运维数据定义", businessType = BusinessType.EXPORT)
    @ApiOperation(value = "导出综合运维数据定义列表",notes = "导出excel表格")
    @PostMapping("/export")
    public void export(HttpServletResponse response, AppData appData) {
        List<AppData> list = appDataService.selectAppDataList(appData);
        ExcelUtil<AppData> util = new ExcelUtil<AppData>(AppData.class);
        util.exportExcel(response, list, "综合运维数据定义数据");
    }

    /**
     * 获取综合运维数据定义详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:data:query')")
    @ApiOperation(value = "获取综合运维数据定义详细信息",notes = "传入id，返回详细信息")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(appDataService.selectAppDataById(id));
    }

    /**
     * 新增综合运维数据定义
     */
    @PreAuthorize("@ss.hasPermi('system:data:add')")
    @Log(title = "综合运维数据定义", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增综合运维数据定义",notes = "传入AppData实体类的属性,json类型")
    @PostMapping
    public AjaxResult add(@RequestBody AppData appData) {
        return toAjax(appDataService.insertAppData(appData));
    }

    /**
     * 修改综合运维数据定义
     */
    @PreAuthorize("@ss.hasPermi('system:data:edit')")
    @Log(title = "综合运维数据定义", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改综合运维数据定义",notes = "传入AppData实体类的属性,json类型")
    @PutMapping
    public AjaxResult edit(@RequestBody AppData appData) {
        return toAjax(appDataService.updateAppData(appData));
    }

    /**
     * 删除综合运维数据定义
     */
    @PreAuthorize("@ss.hasPermi('system:data:remove')")
    @Log(title = "综合运维数据定义", businessType = BusinessType.DELETE)
    @ApiOperation(value = "删除综合运维数据定义",notes = "传入ids,可多传")
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(appDataService.deleteAppDataByIds(ids));
    }

    /**
     * 接收数据 ,通过接收的参数执行相应的业务逻辑操作
     * @return
     */
    @PreAuthorize("ss.hasPermi('system:data:receive')")
    @ApiOperation(value = "接收数据 ,通过接收的参数执行相应的业务逻辑操作",notes = "传入AppDataVo,json类型、appId")
    @PostMapping("/receive")
    public AjaxResult receive(@RequestBody AppDataVo appDataVo, @RequestParam() String appId) {

        return null;
    }


}
