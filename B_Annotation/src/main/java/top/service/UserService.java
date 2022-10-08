package top.service;

import top.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kinoz
 * @Date 2022/7/20 - 20:05
 * @apiNote
 */
@Service
public class UserService {
    //普通属性注入
    @Value("窗前明月光,疑是地上霜")
    private String line_chinese;
    public void valueAnnotation(){
        System.out.println(line_chinese);
    }


    @Autowired
    @Qualifier(value = "userDaoImpl1")  //Qualifier需搭配Autowired使用 一个接口存在多个实现类用于指定具体实现类
    private UserDao userDao;

    @Resource(name = "student")         //相当于autowired和qualifier结合 指定name情况下根据属性名称 不指定情况下根据类型
    private UserDao student;

    public void info(){
        System.out.println("UserService class");
        //调用UserDao中方法 实现类userDaoImpl
        userDao.show();
        //调用UserDao中方法 实现类StudentImpl
        student.show();
    }
}
