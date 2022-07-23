package dynamic;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:24
 * @apiNote 被代理类
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
