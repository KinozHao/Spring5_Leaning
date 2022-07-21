package dynamic;

/**
 * @author kinoz
 * @Date 2022/7/21 - 10:24
 * @apiNote 动态代理体现
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
