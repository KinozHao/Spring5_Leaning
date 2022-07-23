import com.entity.Book;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:36
 * @apiNote
 */
public class BookTest {
    @Test
    public void Test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("druidConfig.xml");
        final BookService bs = context.getBean("bookService", BookService.class);

        //增加操作
        /*final Book book = new Book();
        book.setId(8);
        book.setName("背包十年");
        book.setMoney(39.5);
        book.setPassword("123456");
        bs.addBook(book);*/

        //修改操作
        /*final Book book2 = new Book();
        book2.setId(8);
        book2.setName("骆驼祥子");
        book2.setMoney(19.5);
        book2.setPassword("123456");
        bs.updateBook(book2);*/

        //删除操作
        //bs.delBook("8");

        bs.queryCount();
    }
}
