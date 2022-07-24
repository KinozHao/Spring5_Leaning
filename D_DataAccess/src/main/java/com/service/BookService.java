package com.service;

import com.dao.BookDao;
import com.dao.BookQuery;
import com.entity.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:13
 * @apiNote
 */
@Service
public class BookService {
    @Resource    //注入DAO
    private BookDao bookDao;
    @Resource
    private BookQuery bookQuery;

    //增删改
    public void addBook(Book book){
        bookDao.addBook(book);
    }
    public void delBook(String id){
        bookDao.delBook(id);
    }
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //查询操作
    public void queryCount(){
        final int count = bookQuery.queryCount();
        System.out.println("数据库共存在"+count+"条数据");
    }
    public Book findOne(String id){
        return bookQuery.findBookInfo(id);
    }
    public List<Book> findAll(){
        return bookQuery.findAll();
    }

    //批量操作
    public void batchAdd(List<Object[]> args){
        bookDao.batchAdd(args);
    }
    public void batchUpdate(List<Object[]> args){
        bookDao.batchUpdate(args);
    }
    public void batchDel(List<Object[]> args){
        bookDao.batchDel(args);
    }
}
