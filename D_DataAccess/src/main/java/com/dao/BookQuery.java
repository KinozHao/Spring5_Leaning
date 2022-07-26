package com.dao;

import com.entity.Book;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:26
 * @apiNote Book查询功能
 */
public interface BookQuery {
    //查询表记录数
    int queryCount();
    //查询返回对象
    Book findBookInfo(String id);
    //查询返回集合
    List<Book> findAll();
}
