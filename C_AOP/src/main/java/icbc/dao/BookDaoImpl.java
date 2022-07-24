package icbc.dao;

import icbc.entity.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:45
 * @apiNote
 */
@Component
public class BookDaoImpl implements BookDao{
    @Resource
    private JdbcTemplate jte;

    @Override
    public void add(Book book) {
        String sql = "insert into book_info values(?,?,?,?);";
        final int update = jte.update(sql, book.getId(), book.getName(), book.getMoney(), book.getPassword());
        System.out.println(update);
    }

    @Override
    public void update(Book book) {
        String sql ="update book_info set name=?,money=?,password=? where id = ?";
        final int update = jte.update(sql, book.getName(), book.getMoney(), book.getPassword(), book.getId());
        System.out.println(update);
    }
}
