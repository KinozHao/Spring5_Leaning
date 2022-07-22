package dynamic;

import java.lang.reflect.Proxy;

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
        UserDaoProxy udp = new UserDaoProxy(userDao);           //代理类对象


        //获取接口代理类对象
        UserDao result = (UserDao) Proxy.newProxyInstance(clr, interfaces, udp);
        System.out.println("result:"+result.add(1, 2));
    }
}
