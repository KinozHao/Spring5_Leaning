package affairs.test;

import affairs.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author kinoz
 * @Date 2022/7/29 - 10:34
 * @apiNote junit5整合
 */
//@ExtendWith(SpringExtension.class)//单元测试框架
//@ContextConfiguration("classpath:Bean1.xml") //加载配置文件
@SpringJUnitConfig(locations = "classpath:Bean1.xml")   //上面两个注解的结合
public class JTest5 {
    @Autowired
    private UserService us;
    @Test
    public void test1(){
        us.transfer();
    }

    //函数式注册对象测试
    @Test
    public void lambdaTest(){
        //1.创建GenericApplicationContext对象
        final GenericApplicationContext cont = new GenericApplicationContext();
        //2.调用cont中的方法对象注册
        cont.refresh();

        //Lambda表达式
        //cont.registerBean(Lambda.class,() -> new Lambda());
        //方法引用
        cont.registerBean("ltd",Lambda.class, Lambda::new);

        //3.获取spring的注册对象
        final Lambda ltd = (Lambda) cont.getBean("ltd");
        ltd.info();
        ltd.message("hello");
    }
}
