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
public class AffairsTest {
    @Test
    public void with_Annotation(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }
    @Test
    public void with_xml(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean2.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.transfer();
    }

}
