package com.ruoyi.system.service.impl;

import java.util.*;

import com.ruoyi.system.domain.vo.AppDataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AppDataMapper;
import com.ruoyi.system.domain.AppData;
import com.ruoyi.system.service.IAppDataService;

/**
 * 综合运维数据定义Service业务层处理
 *
 * @author ruoyi
 * @date 2022-10-10
 */
@Service
public class AppDataServiceImpl implements IAppDataService
{
    @Autowired
    private AppDataMapper appDataMapper;

    /**
     * 查询综合运维数据定义
     *
     * @param id 综合运维数据定义主键
     * @return 综合运维数据定义
     */
    @Override
    public AppData selectAppDataById(Long id)
    {
        return appDataMapper.selectAppDataById(id);
    }

    /**
     * 查询综合运维数据定义列表
     *
     * @param appData 综合运维数据定义
     * @return 综合运维数据定义
     */
    @Override
    public List<AppData> selectAppDataList(AppData appData)
    {
        return appDataMapper.selectAppDataList(appData);
    }

    /**
     * 新增综合运维数据定义
     *
     * @param appData 综合运维数据定义
     * @return 结果
     */
    @Override
    public int insertAppData(AppData appData)
    {
        AppDataVo appDataVo = appData.getAppDataVo();
        Map<String, Object> data = appDataVo.getData();
        Iterator<Map.Entry<String, Object>> iterator = data.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> entry = iterator.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if (key.equals("url")){
                appData.setUrl((String) entry.getValue());
            }else if (key.equals("param")){
                appData.setParam((String) entry.getValue());
            }else if (key.equals("val")){
                appData.setVal((String) entry.getValue());
            }else if (key.equals("status")){
                appData.setStatus((Integer) entry.getValue());
            }else if (key.equals("demo")){
                appData.setDemo((String) entry.getValue());
            }

            System.out.println("Key: " + key + ", Value: " + value);
        }
        return appDataMapper.insertAppData(appData);
    }

    /**
     * 修改综合运维数据定义
     *
     * @param appData 综合运维数据定义
     * @return 结果
     */
    @Override
    public int updateAppData(AppData appData)
    {
        return appDataMapper.updateAppData(appData);
    }

    /**
     * 批量删除综合运维数据定义
     *
     * @param ids 需要删除的综合运维数据定义主键
     * @return 结果
     */
    @Override
    public int deleteAppDataByIds(Long[] ids)
    {
        return appDataMapper.deleteAppDataByIds(ids);
    }

    /**
     * 删除综合运维数据定义信息
     *
     * @param id 综合运维数据定义主键
     * @return 结果
     */
    @Override
    public int deleteAppDataById(Long id)
    {
        return appDataMapper.deleteAppDataById(id);
    }
}
