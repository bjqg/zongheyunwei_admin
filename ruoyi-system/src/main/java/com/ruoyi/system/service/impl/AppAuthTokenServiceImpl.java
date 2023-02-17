package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppAuthTokenMapper;
import com.ruoyi.system.domain.AppAuthToken;
import com.ruoyi.system.service.IAppAuthTokenService;

/**
 * 应用授权信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
@Service
public class AppAuthTokenServiceImpl implements IAppAuthTokenService 
{
    @Autowired
    private AppAuthTokenMapper appAuthTokenMapper;

    /**
     * 查询应用授权信息
     * 
     * @param id 应用授权信息主键
     * @return 应用授权信息
     */
    @Override
    public AppAuthToken selectAppAuthTokenById(Long id)
    {
        return appAuthTokenMapper.selectAppAuthTokenById(id);
    }

    /**
     * 查询应用授权信息列表
     * 
     * @param appAuthToken 应用授权信息
     * @return 应用授权信息
     */
    @Override
    public List<AppAuthToken> selectAppAuthTokenList(AppAuthToken appAuthToken)
    {
        return appAuthTokenMapper.selectAppAuthTokenList(appAuthToken);
    }

    /**
     * 新增应用授权信息
     * 
     * @param appAuthToken 应用授权信息
     * @return 结果
     */
    @Override
    public int insertAppAuthToken(AppAuthToken appAuthToken)
    {
        return appAuthTokenMapper.insertAppAuthToken(appAuthToken);
    }

    /**
     * 修改应用授权信息
     * 
     * @param appAuthToken 应用授权信息
     * @return 结果
     */
    @Override
    public int updateAppAuthToken(AppAuthToken appAuthToken)
    {
        return appAuthTokenMapper.updateAppAuthToken(appAuthToken);
    }

    /**
     * 批量删除应用授权信息
     * 
     * @param ids 需要删除的应用授权信息主键
     * @return 结果
     */
    @Override
    public int deleteAppAuthTokenByIds(Long[] ids)
    {
        return appAuthTokenMapper.deleteAppAuthTokenByIds(ids);
    }

    /**
     * 删除应用授权信息信息
     * 
     * @param id 应用授权信息主键
     * @return 结果
     */
    @Override
    public int deleteAppAuthTokenById(Long id)
    {
        return appAuthTokenMapper.deleteAppAuthTokenById(id);
    }
}
