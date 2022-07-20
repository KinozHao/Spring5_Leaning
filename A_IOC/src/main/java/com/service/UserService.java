package com.service;

import com.dao.UserDao;

/**
 * @author kinoz
 * @Date 2022/7/17 - 9:54
 * @apiNote
 */
public class UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("add................");
        userDao.updateAdd();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
