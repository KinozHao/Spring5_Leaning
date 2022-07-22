package with_Annotation;

import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/22 - 18:38
 * @apiNote 被增强类
 */
@Component
public class User {
    public void show(){
        System.out.println("a message from user");
    }
}
