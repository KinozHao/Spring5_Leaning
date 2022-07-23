package com.dao;

import com.entity.Book;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:12
 * @apiNote
 */
public interface BookDao {
    //增
    void addBook(Book book);
    //删
    void delBook(String id);
    //改
    void updateBook(Book book);

    //查询表记录数
    int QueryCount();
}
