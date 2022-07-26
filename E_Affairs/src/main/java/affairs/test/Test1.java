package affairs.test;

import affairs.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/26 - 16:15
 * @apiNote
 */
public class Test1 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("AffairsBean.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }
}
