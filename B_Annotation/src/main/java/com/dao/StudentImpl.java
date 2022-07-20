package com.dao;

import org.springframework.stereotype.Component;

/**
 * @author kinoz
 * @Date 2022/7/20 - 20:17
 * @apiNote
 */
@Component(value = "student")
public class StudentImpl implements UserDao {
    @Override
    public void show() {
        System.out.println("学生用户群体");
    }
}
