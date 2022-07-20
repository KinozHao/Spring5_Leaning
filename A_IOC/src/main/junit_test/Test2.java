import com.ltd.Staff;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/17 - 9:13
 * @apiNote
 */
public class Test2 {
    @Test
    public void outBean(){
        //外部bean格式
        //加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //获取配置创建的对象
        UserService use = context.getBean("userService", UserService.class);
        use.add();

        System.out.println("-----------------------------------");
        //内部bean格式
        Staff em1 = context.getBean("employee", Staff.class);
        em1.showInfo();

        System.out.println("-----------------------------------");
        Staff em2 = context.getBean("employee2", Staff.class);
        em2.showInfo();

    }
}
