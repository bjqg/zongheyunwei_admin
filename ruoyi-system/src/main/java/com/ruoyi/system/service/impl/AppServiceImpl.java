package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppMapper;
import com.ruoyi.system.domain.App;
import com.ruoyi.system.service.IAppService;

/**
 * 接入的应用Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
@Service
public class AppServiceImpl implements IAppService 
{
    @Autowired
    private AppMapper appMapper;

    /**
     * 查询接入的应用
     * 
     * @param id 接入的应用主键
     * @return 接入的应用
     */
    @Override
    public App selectAppById(Long id)
    {
        return appMapper.selectAppById(id);
    }

    /**
     * 查询接入的应用列表
     * 
     * @param app 接入的应用
     * @return 接入的应用
     */
    @Override
    public List<App> selectAppList(App app)
    {
        return appMapper.selectAppList(app);
    }

    /**
     * 新增接入的应用
     * 
     * @param app 接入的应用
     * @return 结果
     */
    @Override
    public int insertApp(App app)
    {
        return appMapper.insertApp(app);
    }

    /**
     * 修改接入的应用
     * 
     * @param app 接入的应用
     * @return 结果
     */
    @Override
    public int updateApp(App app)
    {
        return appMapper.updateApp(app);
    }

    /**
     * 批量删除接入的应用
     * 
     * @param ids 需要删除的接入的应用主键
     * @return 结果
     */
    @Override
    public int deleteAppByIds(Long[] ids)
    {
        return appMapper.deleteAppByIds(ids);
    }

    /**
     * 删除接入的应用信息
     * 
     * @param id 接入的应用主键
     * @return 结果
     */
    @Override
    public int deleteAppById(Long id)
    {
        return appMapper.deleteAppById(id);
    }
}
