package dot.test;

import dot.mapper.CRUD_Mapper;
import dot.pojo.Book;
import dot.util.MybatisTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author kinoz
 * @Date 2022/11/30 17:03
 * @apiNote
 */
public class CRUD_Test {
    SqlSession sqlSession = MybatisTools.openSession(true);
    CRUD_Mapper mapper = sqlSession.getMapper(CRUD_Mapper.class);

    @Test
    public void addBook(){
        mapper.addBook(new Book(null,"《海边的卡夫卡》",12.5,"日本"));
    }

    @Test
    public void delBook(){
        mapper.delBook("35");
    }

    @Test
    public void updateBook(){
        mapper.updateBook(29,"MySQL数据库",45.56,"中国");
    }

    @Test
    public void selectCount(){
        int i = mapper.queryCount();
        System.out.println("data count :"+i);
    }

    @Test
    public void test_Book(){
        List<Book> allBook = mapper.getAllBook();
        //查询所有数据
        //allBook.forEach(System.out::println);
        //查询单条数据
        Book bookInfo = mapper.findBookInfo("36");
        System.out.println(bookInfo);
    }
}
