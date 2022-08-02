package with_zhujie;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/22 - 18:38
 * @apiNote 被增强类
 */
@Component
public class User {
    public void show(){
        System.out.println("a message from user");
    }

    @Test //Aop测试
    public void annotationTest(){
        //基于注解测试
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("UserConfig.xml");
        final User user = context.getBean("user", User.class);
        user.show();
    }
}
