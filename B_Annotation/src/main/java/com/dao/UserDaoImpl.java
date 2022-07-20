package com.dao;

import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/20 - 20:05
 * @apiNote
 */
@Component(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("我是实现类");
    }
}
