package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.App;

/**
 * 接入的应用Service接口
 *
 * @author ruoyi
 * @date 2022-10-10
 */
public interface IAppService
{
    /**
     * 查询接入的应用
     *
     * @param id 接入的应用主键
     * @return 接入的应用
     */
    public App selectAppById(Long id);

    /**
     * 查询接入的应用列表
     *
     * @param app 接入的应用
     * @return 接入的应用集合
     */
    public List<App> selectAppList(App app);

    /**
     * 新增接入的应用
     *
     * @param app 接入的应用
     * @return 结果
     */
    public int insertApp(App app);

    /**
     * 修改接入的应用
     *
     * @param app 接入的应用
     * @return 结果
     */
    public int updateApp(App app);

    /**
     * 批量删除接入的应用
     *
     * @param ids 需要删除的接入的应用主键集合
     * @return 结果
     */
    public int deleteAppByIds(Long[] ids);

    /**
     * 删除接入的应用信息
     *
     * @param id 接入的应用主键
     * @return 结果
     */
    public int deleteAppById(Long id);
}
