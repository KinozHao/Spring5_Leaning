package with_zhujie;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/22 - 19:39
 * @apiNote 增强类2
 */
@Component
@Aspect
public class StudentProxy {
    @Value("前置对象")
    private String level;
    @Before(value = "execution(* with_zhujie.User.show(..))")
    @Order(0)       //此注解设置优先级 数字小等级高
    public void show(){
        System.out.println(level+":我是小学生使用了order我优先");
    }
}
