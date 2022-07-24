import auto_package.Staff;
import life_circle.LifeCircle;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/18 - 18:36
 * @apiNote bean生命周期和bean自动装箱测试
 */
public class Test3 {
    @Test
    public void Test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LifeCircle.xml");
        LifeCircle lc = context.getBean("lc", LifeCircle.class);
        System.out.println("4.对象获取到，bean可以使用");
        System.out.println(lc);
        //5.销毁方法
        context.close();
    }

    @Test
    public void autoTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
        Staff staff = context.getBean("staff", Staff.class);
        System.out.println(staff);
    }
}
