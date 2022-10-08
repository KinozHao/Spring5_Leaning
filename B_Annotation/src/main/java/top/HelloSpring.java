package top;

import org.springframework.stereotype.Repository;

/**
 * @author kinoz
 * @Date 2022/7/20 - 19:15
 * @apiNote spring注解使用          注解中value值可不写 默认为类名(首字母会小写)
 */
@Repository(value = "helloSpring") //等价于xml中 <bean id="helloSpring" class="com.class1.HelloSpring/>
public class HelloSpring {
    public void show(){
        System.out.println("simple spring annotation use");
    }
}
