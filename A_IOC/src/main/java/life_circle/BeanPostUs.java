package life_circle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author kinoz
 * @Date 2022/7/18 - 18:43
 * @apiNote 后置处理器的使用
 */
public class BeanPostUs implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化前执行");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("初始化后执行");
        return o;
    }
}
