import com.ruoyi.RuoYiApplication;
import com.ruoyi.system.domain.AppData;
import com.ruoyi.system.domain.vo.AppDataVo;
import com.ruoyi.system.mapper.AppDataMapper;
import com.ruoyi.system.service.impl.AppDataServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: lbj
 * @date: 2022/11/28 14:18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RuoYiApplication.class})
public class SpringTest {

    @Resource
    private AppDataServiceImpl appDataService;

    @Test
    public void ConTest() throws SQLException {
        System.out.println("测试成功！！！");
    }

    @Test
    public void AppDataTest(){

//        HashMap<String, Object> data = new HashMap<>();
//        data.put("url","www.baidu.com");
//        data.put("name","zcxx");
//        data.put("action","insert");
//        data.put("val","{'设备类型':'服务器'，'设备名称':'综合楼xxx'，'健康值':'0.00%'，'当前异常':'警告'，'响应时间':'2毫秒'，'cpu':'88%'， 'mem':'14%'，'xxx':'xxx'}");
//        data.put("status",0);
//        data.put("demo","{'设备类型':'服务器'，'设备名称':'综合楼xxx'，'健康值':'0.00%'，'当前异常':'警告'，'响应时间':'2毫秒'，'cpu':'88%'， 'mem':'14%'，'xxx':'xxx'}");
//        AppData appData = new AppData();
//        appData.setId(2l);
//        appData.setAppId(1);
//        appData.setStatus(0);
//        appData.setAction("insert");
//        appData.setName("资产管控信息");
//        AppDataVo appDataVo = new AppDataVo();
//        appDataVo.setCode("200");
//        appDataVo.setMsg("获取成功");
//        appDataVo.setData(data);
//        appData.setAppDataVo(appDataVo);
//        appDataService.insertAppData(appData);
        AppData appData = appDataService.selectAppDataById(2L);
        System.out.println(appData);
    }
}
