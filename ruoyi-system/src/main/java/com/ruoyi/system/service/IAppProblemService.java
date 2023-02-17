package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.AppProblem;

/**
 * 告警信息（默认保存15天信息）Service接口
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
public interface IAppProblemService 
{
    /**
     * 查询告警信息（默认保存15天信息）
     * 
     * @param id 告警信息（默认保存15天信息）主键
     * @return 告警信息（默认保存15天信息）
     */
    public AppProblem selectAppProblemById(Long id);

    /**
     * 查询告警信息（默认保存15天信息）列表
     * 
     * @param appProblem 告警信息（默认保存15天信息）
     * @return 告警信息（默认保存15天信息）集合
     */
    public List<AppProblem> selectAppProblemList(AppProblem appProblem);

    /**
     * 新增告警信息（默认保存15天信息）
     * 
     * @param appProblem 告警信息（默认保存15天信息）
     * @return 结果
     */
    public int insertAppProblem(AppProblem appProblem);

    /**
     * 修改告警信息（默认保存15天信息）
     * 
     * @param appProblem 告警信息（默认保存15天信息）
     * @return 结果
     */
    public int updateAppProblem(AppProblem appProblem);

    /**
     * 批量删除告警信息（默认保存15天信息）
     * 
     * @param ids 需要删除的告警信息（默认保存15天信息）主键集合
     * @return 结果
     */
    public int deleteAppProblemByIds(Long[] ids);

    /**
     * 删除告警信息（默认保存15天信息）信息
     * 
     * @param id 告警信息（默认保存15天信息）主键
     * @return 结果
     */
    public int deleteAppProblemById(Long id);
}
