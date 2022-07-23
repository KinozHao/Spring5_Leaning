package dynamic;

import java.lang.reflect.Proxy;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:29
 * @apiNote jdk方式实现动态代理
 */
public class ProxyTest {
    public static void main(String[] args) {
        ClassLoader clr = ProxyTest.class.getClassLoader();      //本类加载器
        Class[] interfaces = {UserDao.class};                   //被代理接口
        UserDao userDao = new UserDaoImpl();                    //被代理类对象
        UserDaoProxy proxy = new UserDaoProxy(userDao);         //代理类对象


        //获取代理类对象
        UserDao result = (UserDaoImpl) Proxy.newProxyInstance(clr, interfaces, proxy);
        System.out.println("result:"+result.add(1, 2));
    }
}
