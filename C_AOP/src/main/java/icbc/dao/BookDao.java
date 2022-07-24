package icbc.dao;

import icbc.entity.Book;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:44
 * @apiNote
 */
public interface BookDao {
    void add(Book book);
    void update(Book book);
}
