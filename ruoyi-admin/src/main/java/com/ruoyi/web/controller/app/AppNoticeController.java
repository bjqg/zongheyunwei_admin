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
import com.ruoyi.system.domain.AppNotice;
import com.ruoyi.system.service.IAppNoticeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通知公告Controller
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@Api(tags = "通知公告")
@RestController
@RequestMapping("/system/app/notice")
public class AppNoticeController extends BaseController
{
    @Autowired
    private IAppNoticeService appNoticeService;

    /**
     * 查询通知公告列表
     */
    @PreAuthorize("@ss.hasPermi('system:notice:list')")
    @ApiOperation(value = "查询通知公告列表",notes = "传入AppNotice实体类的属性,返回表格分页数据对象")
    @GetMapping("/list")
    public TableDataInfo list(AppNotice appNotice)
    {
        startPage();
        List<AppNotice> list = appNoticeService.selectAppNoticeList(appNotice);
        return getDataTable(list);
    }

    /**
     * 导出通知公告列表
     */
    @PreAuthorize("@ss.hasPermi('system:notice:export')")
    @Log(title = "通知公告", businessType = BusinessType.EXPORT)
    @ApiOperation(value = "导出通知公告列表",notes = "传入AppNotice实体类的属性，导出excel表格")
    @PostMapping("/export")
    public void export(HttpServletResponse response, AppNotice appNotice)
    {
        List<AppNotice> list = appNoticeService.selectAppNoticeList(appNotice);
        ExcelUtil<AppNotice> util = new ExcelUtil<AppNotice>(AppNotice.class);
        util.exportExcel(response, list, "通知公告数据");
    }

    /**
     * 获取通知公告详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:notice:query')")
    @ApiOperation(value = "获取通知公告详细信息",notes = "传入noticeId")
    @GetMapping(value = "/{noticeId}")
    public AjaxResult getInfo(@PathVariable("noticeId") Integer noticeId)
    {
        return AjaxResult.success(appNoticeService.selectAppNoticeByNoticeId(noticeId));
    }

    /**
     * 新增通知公告
     */
    @PreAuthorize("@ss.hasPermi('system:notice:add')")
    @Log(title = "通知公告", businessType = BusinessType.INSERT)
    @ApiOperation(value = "新增通知公告",notes = "传入AppNotice,json类型")
    @PostMapping
    public AjaxResult add(@RequestBody AppNotice appNotice)
    {
        return toAjax(appNoticeService.insertAppNotice(appNotice));
    }

    /**
     * 修改通知公告
     */
    @PreAuthorize("@ss.hasPermi('system:notice:edit')")
    @Log(title = "通知公告", businessType = BusinessType.UPDATE)
    @ApiOperation(value = "修改通知公告",notes = "传入AppNptice,json类型")
    @PutMapping
    public AjaxResult edit(@RequestBody AppNotice appNotice)
    {
        return toAjax(appNoticeService.updateAppNotice(appNotice));
    }

    /**
     * 删除通知公告
     */
    @PreAuthorize("@ss.hasPermi('system:notice:remove')")
    @Log(title = "通知公告", businessType = BusinessType.DELETE)
    @ApiOperation(value = "删除通知公告",notes = "传入noticeIds，可多传")
	@DeleteMapping("/{noticeIds}")
    public AjaxResult remove(@PathVariable Integer[] noticeIds)
    {
        return toAjax(appNoticeService.deleteAppNoticeByNoticeIds(noticeIds));
    }
}
