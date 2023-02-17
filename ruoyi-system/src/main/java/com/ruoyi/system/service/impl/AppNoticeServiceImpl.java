package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppNoticeMapper;
import com.ruoyi.system.domain.AppNotice;
import com.ruoyi.system.service.IAppNoticeService;

/**
 * 通知公告Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
@Service
public class AppNoticeServiceImpl implements IAppNoticeService 
{
    @Autowired
    private AppNoticeMapper appNoticeMapper;

    /**
     * 查询通知公告
     * 
     * @param noticeId 通知公告主键
     * @return 通知公告
     */
    @Override
    public AppNotice selectAppNoticeByNoticeId(Integer noticeId)
    {
        return appNoticeMapper.selectAppNoticeByNoticeId(noticeId);
    }

    /**
     * 查询通知公告列表
     * 
     * @param appNotice 通知公告
     * @return 通知公告
     */
    @Override
    public List<AppNotice> selectAppNoticeList(AppNotice appNotice)
    {
        return appNoticeMapper.selectAppNoticeList(appNotice);
    }

    /**
     * 新增通知公告
     * 
     * @param appNotice 通知公告
     * @return 结果
     */
    @Override
    public int insertAppNotice(AppNotice appNotice)
    {
        appNotice.setCreateTime(DateUtils.getNowDate());
        return appNoticeMapper.insertAppNotice(appNotice);
    }

    /**
     * 修改通知公告
     * 
     * @param appNotice 通知公告
     * @return 结果
     */
    @Override
    public int updateAppNotice(AppNotice appNotice)
    {
        appNotice.setUpdateTime(DateUtils.getNowDate());
        return appNoticeMapper.updateAppNotice(appNotice);
    }

    /**
     * 批量删除通知公告
     * 
     * @param noticeIds 需要删除的通知公告主键
     * @return 结果
     */
    @Override
    public int deleteAppNoticeByNoticeIds(Integer[] noticeIds)
    {
        return appNoticeMapper.deleteAppNoticeByNoticeIds(noticeIds);
    }

    /**
     * 删除通知公告信息
     * 
     * @param noticeId 通知公告主键
     * @return 结果
     */
    @Override
    public int deleteAppNoticeByNoticeId(Integer noticeId)
    {
        return appNoticeMapper.deleteAppNoticeByNoticeId(noticeId);
    }
}
