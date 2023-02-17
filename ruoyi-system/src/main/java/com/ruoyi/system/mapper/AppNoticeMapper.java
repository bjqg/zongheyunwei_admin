package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.AppNotice;

/**
 * 通知公告Mapper接口
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
public interface AppNoticeMapper 
{
    /**
     * 查询通知公告
     * 
     * @param noticeId 通知公告主键
     * @return 通知公告
     */
    public AppNotice selectAppNoticeByNoticeId(Integer noticeId);

    /**
     * 查询通知公告列表
     * 
     * @param appNotice 通知公告
     * @return 通知公告集合
     */
    public List<AppNotice> selectAppNoticeList(AppNotice appNotice);

    /**
     * 新增通知公告
     * 
     * @param appNotice 通知公告
     * @return 结果
     */
    public int insertAppNotice(AppNotice appNotice);

    /**
     * 修改通知公告
     * 
     * @param appNotice 通知公告
     * @return 结果
     */
    public int updateAppNotice(AppNotice appNotice);

    /**
     * 删除通知公告
     * 
     * @param noticeId 通知公告主键
     * @return 结果
     */
    public int deleteAppNoticeByNoticeId(Integer noticeId);

    /**
     * 批量删除通知公告
     * 
     * @param noticeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppNoticeByNoticeIds(Integer[] noticeIds);
}
