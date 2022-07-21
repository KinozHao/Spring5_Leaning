package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:29
 * @apiNote jdk方式实现动态代理
 */
public class JdkProxy {
    public static void main(String[] args) {
        ClassLoader clr = JdkProxy.class.getClassLoader();      //本类加载器
        Class[] interfaces = {UserDao.class};                   //被代理接口
        UserDao userDao = new UserDaoImpl();                    //被代理接口实现类
        UserDaoProxy udp = new UserDaoProxy(userDao);           //代理类

        //获取接口代理类对象
        UserDao result = (UserDao) Proxy.newProxyInstance(clr, interfaces, udp);
        System.out.println("result:"+result.add(1, 2));
    }
}
//代理对象代码
class UserDaoProxy implements InvocationHandler{
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