package top.test;


import top.config.SpringConfig;
import top.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.class1.HelloSpring;

/**
 * @author kinoz
 * @Date 2022/7/20 - 19:18
 * @apiNote
 */
public class Test1 {
    @Test
    public void HellSpringTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        HelloSpring hs = context.getBean("helloSpring", HelloSpring.class);
        System.out.println("对象输出 "+hs);
        //调用类中方法
        hs.show();

    }
    @Test
    public void UserDaoTest(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        final UserService userService = context.getBean("userService", UserService.class);
        userService.info();
        System.out.println("-----");
        //普通属性注入@Value
        userService.value();

    }
    @Test
    public void UserDaoTest2(){
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        final UserService userService = context.getBean("userService", UserService.class);
        System.out.println("-------完全基于注解开发--------");
        userService.info();
        System.out.println("----------------------------");
        //普通属性注入@Value
        userService.value();
    }
}
