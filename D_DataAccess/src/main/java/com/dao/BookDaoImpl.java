package com.dao;

import com.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


/**
 * @author kinoz
 * @Date 2022/7/23 - 15:12
 * @apiNote
 */
@Component
public class BookDaoImpl implements BookDao {

    //注入jdbc template
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //增
    @Override
    public void addBook(Book book) {
        String sql = "insert into book_info values(?,?,?,?)";
        int add= jdbcTemplate.update(sql, book.getId(), book.getName(), book.getMoney(), book.getPassword());
        System.out.println(sql);
        System.out.println("添加成功:影响行数"+add);
    }

    //删
    @Override
    public void delBook(String id) {
        String sql = "delete from book_info where id=?";
        final int del = jdbcTemplate.update(sql, id);
        System.out.println("删除成功:影响行数"+del);
    }

    //改
    @Override
    public void updateBook(Book book) {
        String  sql = "update book_info set name=?,money=?,password=? where id=?";
        final int update = jdbcTemplate.update(sql, book.getName(), book.getMoney(), book.getPassword(), book.getId());
        System.out.println("修改成功:影响行数"+update);
    }




    //批量添加
    @Override
    public void batchAdd(List<Object[]> args) {
        String sql = "insert into book_info values(?,?,?,?)";
        final int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));
    }
    //批量修改

    @Override
    public void batchUpdate(List<Object[]> args) {
        String  sql = "update book_info set name=?,money=?,password=? where id=?";
        final int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDel(List<Object[]> args) {
        String sql = "delete from book_info where id = ?";
        final int[] ints = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(ints));
    }
}
