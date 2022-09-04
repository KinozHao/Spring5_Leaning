package b_autowire;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    @Test
    public void Test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("b_bean_autowire.xml");
        Staff staff = context.getBean("staff", Staff.class);
        System.out.println(staff);
    }
}
