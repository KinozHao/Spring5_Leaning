package d_top.dao;

import d_top.entity.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:26
 * @apiNote
 */
@Component
public class BookQueryImpl implements BookQuery{

    //注入jdbc template
    @Resource
    private JdbcTemplate jdbcTemplate;
    //查询表记录数
    @Override
    public int queryCount() {
        String sql = "select count(*) from book_info";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    //根据id查详情
    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from book_info where id=?";
        //RowMapper接口 根据返回值类型 实现类完成数据封装
        final Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询所有数据信息
    @Override
    public List<Book> findAll() {
        String sql = "select * from book_info;";
        final List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return query;
    }
}
