package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.AppAuthToken;

/**
 * 应用授权信息Service接口
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
public interface IAppAuthTokenService 
{
    /**
     * 查询应用授权信息
     * 
     * @param id 应用授权信息主键
     * @return 应用授权信息
     */
    public AppAuthToken selectAppAuthTokenById(Long id);

    /**
     * 查询应用授权信息列表
     * 
     * @param appAuthToken 应用授权信息
     * @return 应用授权信息集合
     */
    public List<AppAuthToken> selectAppAuthTokenList(AppAuthToken appAuthToken);

    /**
     * 新增应用授权信息
     * 
     * @param appAuthToken 应用授权信息
     * @return 结果
     */
    public int insertAppAuthToken(AppAuthToken appAuthToken);

    /**
     * 修改应用授权信息
     * 
     * @param appAuthToken 应用授权信息
     * @return 结果
     */
    public int updateAppAuthToken(AppAuthToken appAuthToken);

    /**
     * 批量删除应用授权信息
     * 
     * @param ids 需要删除的应用授权信息主键集合
     * @return 结果
     */
    public int deleteAppAuthTokenByIds(Long[] ids);

    /**
     * 删除应用授权信息信息
     * 
     * @param id 应用授权信息主键
     * @return 结果
     */
    public int deleteAppAuthTokenById(Long id);
}
