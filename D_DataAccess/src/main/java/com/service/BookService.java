package com.service;

import com.dao.BookDao;
import com.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:13
 * @apiNote
 */
@Service
public class BookService {
    //注入DAO
    @Resource
    private BookDao bookDao;

    //增
    public void addBook(Book book){
        bookDao.addBook(book);
    }
    //删
    public void delBook(String id){
        bookDao.delBook(id);
    }
    //改
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //查询表记录数
    public void queryCount(){
        final int count = bookDao.QueryCount();
        System.out.println("数据库共存在"+count+"条数据");
    }
}
