package affairs.test;

import affairs.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author kinoz
 * @Date 2022/7/29 - 10:13
 * @apiNote junit4整合测试
 */
@RunWith(SpringJUnit4ClassRunner.class) //单元测试框架
@ContextConfiguration("classpath:Bean1.xml")    //加载配置文件
public class JTest4 {
    @Autowired
    private UserService us;
    @Test
    public void test1(){
        us.transfer();
    }
}
