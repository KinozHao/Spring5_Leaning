package top.dao;

import org.springframework.stereotype.Repository;

/**
 * @author kinoz
 * @Date 2022/7/20 - 20:17
 * @apiNote
 */
@Repository(value = "student")
public class StudentImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("学生用户群体");
    }
}
