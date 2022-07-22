package with_Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/22 - 18:42
 * @apiNote 增强类
 */
@Component
@Aspect //生成代理对象
public class UserProxy {
    //相同的切入点抽取
    @Pointcut(value ="execution(* with_Annotation.User.show(..))")
    public void userPoint(){};

    //默认写法
    @Before(value = "execution(* with_Annotation.User.show(..))")
    public void before(){
        System.out.println("前置通知");
    }

    //使用切入点抽取方法替代
    @After(value = "userPoint()")
    public void after(){
        //有异常也执行(最终通知)
        System.out.println("最终通知");
    }

    @AfterReturning(value = "userPoint()")
    public void AfterReturning(){
        //有异常就不执行了，方法返回结果后执行
        System.out.println("后置通知");
    }

    @AfterThrowing(value = "userPoint()")
    public void AfterThrowing(){
        //有异常时才执行
        System.out.println("异常通知");
    }

    @Around(value = "userPoint()")
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知");
        //代表被增强的方法执行
        joinPoint.proceed();
        System.out.println("环绕后通知");
    }
}
