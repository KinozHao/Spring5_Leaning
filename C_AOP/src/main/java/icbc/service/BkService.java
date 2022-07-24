package icbc.service;

import icbc.dao.BookDao;
import icbc.dao.BookDaoImpl;
import icbc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:51
 * @apiNote
 */
@Service
public class BkService {
    @Autowired
    public BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }

    public void update(Book book){
        bookDao.update(book);
    }
}
