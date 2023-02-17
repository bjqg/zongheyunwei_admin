package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.App;

/**
 * 接入的应用Mapper接口
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
public interface AppMapper 
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
     * 删除接入的应用
     * 
     * @param id 接入的应用主键
     * @return 结果
     */
    public int deleteAppById(Long id);

    /**
     * 批量删除接入的应用
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppByIds(Long[] ids);
}
