package e_life_circle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/18 - 18:36
 * @apiNote bean生命周期和bean自动装箱测试
 */
public class LC_Test {
    @Test
    public void lifeTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("LifeBean.xml");
        LifeCircle lc = context.getBean("lc", LifeCircle.class);
        System.out.println("4.对象获取到，bean可以使用");
        System.out.println(lc);
        //5.销毁方法
        context.close();
    }
}
