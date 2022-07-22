package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author kinoz
 * @Date 2022/7/22 - 20:32
 * @apiNote
 */ //代理对象代码
class UserDaoProxy implements InvocationHandler {
    //1.把创建的是谁的对象，把谁传递进来
    //有参数构造传递
    private Object obj; //使用Object提高通用性
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强的逻辑写在invoke方法里面
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println("方法前执行:"+"方法名称-->"+method.getName()+" 传递的参数-->"+ Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法后执行:"+obj);
        return res;
    }
}
