package dot.mapper;

import dot.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/30 16:53
 * @apiNote
 */
public interface CRUD_Mapper {
    //增
    void addBook(Book book);
    //删
    void delBook(@Param("id") String id);
    //改
    void updateBook(@Param("id") Integer id,
                    @Param("name") String name,
                    @Param("money") Double money,
                    @Param("country") String country);

    //查询所有数据
    List<Book> getAllBook();
    //查询表记录数
    int queryCount();
    //查询单条数据(根据id)
    Book findBookInfo(String id);

}
