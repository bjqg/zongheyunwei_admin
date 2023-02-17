package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.AppData;

/**
 * 综合运维数据定义Mapper接口
 * 
 * @author ruoyi
 * @date 2022-10-10
 */
public interface AppDataMapper 
{
    /**
     * 查询综合运维数据定义
     * 
     * @param id 综合运维数据定义主键
     * @return 综合运维数据定义
     */
    public AppData selectAppDataById(Long id);

    /**
     * 查询综合运维数据定义列表
     * 
     * @param appData 综合运维数据定义
     * @return 综合运维数据定义集合
     */
    public List<AppData> selectAppDataList(AppData appData);

    /**
     * 新增综合运维数据定义
     * 
     * @param appData 综合运维数据定义
     * @return 结果
     */
    public int insertAppData(AppData appData);

    /**
     * 修改综合运维数据定义
     * 
     * @param appData 综合运维数据定义
     * @return 结果
     */
    public int updateAppData(AppData appData);

    /**
     * 删除综合运维数据定义
     * 
     * @param id 综合运维数据定义主键
     * @return 结果
     */
    public int deleteAppDataById(Long id);

    /**
     * 批量删除综合运维数据定义
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAppDataByIds(Long[] ids);
}
