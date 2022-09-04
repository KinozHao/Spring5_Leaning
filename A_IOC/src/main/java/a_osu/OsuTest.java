package a_osu;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/15 - 11:02
 * @apiNote 多种注入方式测试
 */
public class OsuTest {
    @Test
    //方式一:ApplicationContext
    public void ALCTest(){
        //加载spring配置文件,同时创建对象
        ApplicationContext acs = new ClassPathXmlApplicationContext("a_osu.xml");
        //获取配置创建的对象
        User user = acs.getBean("user", User.class);
        user.UsOutput();
        user.param();
        Servers server = acs.getBean("server", Servers.class);
        server.seOutput();

    }
    @Test
    //方式二:BeanFactory
    public void BFTest(){
        //只加载，不创建对象
        BeanFactory bfy = new ClassPathXmlApplicationContext("a_osu.xml");
        Servers server = bfy.getBean("server", Servers.class);
        server.seOutput();
        System.out.println(server.getServerName());
    }

    @Test
    //方式三:p标签注入
    public void orderTest(){
        ApplicationContext app = new ClassPathXmlApplicationContext("a_osu.xml");

        Orders order = app.getBean("order", Orders.class);
            order.OrderInfo();
    }
}
