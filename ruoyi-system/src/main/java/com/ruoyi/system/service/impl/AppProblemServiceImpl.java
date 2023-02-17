package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppProblemMapper;
import com.ruoyi.system.domain.AppProblem;
import com.ruoyi.system.service.IAppProblemService;

/**
 * 告警信息（默认保存15天信息）Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
@Service
public class AppProblemServiceImpl implements IAppProblemService 
{
    @Autowired
    private AppProblemMapper appProblemMapper;

    /**
     * 查询告警信息（默认保存15天信息）
     * 
     * @param id 告警信息（默认保存15天信息）主键
     * @return 告警信息（默认保存15天信息）
     */
    @Override
    public AppProblem selectAppProblemById(Long id)
    {
        return appProblemMapper.selectAppProblemById(id);
    }

    /**
     * 查询告警信息（默认保存15天信息）列表
     * 
     * @param appProblem 告警信息（默认保存15天信息）
     * @return 告警信息（默认保存15天信息）
     */
    @Override
    public List<AppProblem> selectAppProblemList(AppProblem appProblem)
    {
        return appProblemMapper.selectAppProblemList(appProblem);
    }

    /**
     * 新增告警信息（默认保存15天信息）
     * 
     * @param appProblem 告警信息（默认保存15天信息）
     * @return 结果
     */
    @Override
    public int insertAppProblem(AppProblem appProblem)
    {
        return appProblemMapper.insertAppProblem(appProblem);
    }

    /**
     * 修改告警信息（默认保存15天信息）
     * 
     * @param appProblem 告警信息（默认保存15天信息）
     * @return 结果
     */
    @Override
    public int updateAppProblem(AppProblem appProblem)
    {
        return appProblemMapper.updateAppProblem(appProblem);
    }

    /**
     * 批量删除告警信息（默认保存15天信息）
     * 
     * @param ids 需要删除的告警信息（默认保存15天信息）主键
     * @return 结果
     */
    @Override
    public int deleteAppProblemByIds(Long[] ids)
    {
        return appProblemMapper.deleteAppProblemByIds(ids);
    }

    /**
     * 删除告警信息（默认保存15天信息）信息
     * 
     * @param id 告警信息（默认保存15天信息）主键
     * @return 结果
     */
    @Override
    public int deleteAppProblemById(Long id)
    {
        return appProblemMapper.deleteAppProblemById(id);
    }
}
