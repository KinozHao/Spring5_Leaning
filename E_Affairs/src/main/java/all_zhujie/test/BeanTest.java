package all_zhujie.test;

import all_zhujie.service.UserService;
import all_zhujie.util.BeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/29 - 8:52
 * @apiNote 完全注解开发 由于导入的有配置类不可与基于Bean文件的测试在同一包下
 */
public class BeanTest {
    @Test
    public void All_annotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        final UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }
}
