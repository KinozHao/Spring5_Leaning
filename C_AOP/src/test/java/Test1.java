import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import with_Annotation.User;

/**
 * @author kinoz
 * @Date 2022/7/22 - 18:58
 * @apiNote aop测试
 */
public class Test1 {
    @Test
    public void annotationTest(){
        //基于注解测试
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("UserConfig.xml");
        final User user = context.getBean("user", User.class);
        user.show();
    }
}
