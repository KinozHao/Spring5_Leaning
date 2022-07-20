import com.mysql.fabric.Server;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * @author kinoz
 * @Date 2022/7/15 - 11:02
 * @apiNote
 */
public class Test1 {
    @Test
    //方式一ApplicationContext
    public void ALCTest(){
        //加载spring配置文件,同时创建对象
        ApplicationContext acs = new ClassPathXmlApplicationContext("bean.xml");
        //获取配置创建的对象
        User user = acs.getBean("user", User.class);
        user.UsOutput();
        user.param();
        ServerFw server = acs.getBean("server", ServerFw.class);
        server.seOutput();

    }
    @Test
    //方式二BeanFactory
    public void BFTest(){
        //只加载，不创建对象
        BeanFactory bfy = new ClassPathXmlApplicationContext("bean.xml");
        ServerFw server = bfy.getBean("server", ServerFw.class);
        server.seOutput();
        System.out.println(server.getServerName());
    }

    @Test
    public void orderTest(){
        ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");

        Orders order = app.getBean("order", Orders.class);
            order.OrderInfo();
    }
}
