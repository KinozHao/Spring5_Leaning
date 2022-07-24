import icbc.entity.Book;
import icbc.service.BkService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/24 - 15:55
 * @apiNote
 */
public class BokTest {
    @Test
    public void addTest(){
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("druid.xml");
        final BkService bk = context.getBean("bkService", BkService.class);
        Book book1 = new Book();
        book1.setId(15);
        book1.setName("海边的卡弗伐");
        book1.setMoney(99.3);
        book1.setPassword("123456");
        //bk.add(book1);

        final Book book2 = new Book();
        book2.setId(15);
        book2.setName("我们的小时光");
        book2.setMoney(26.3);
        book2.setPassword("843456");
        bk.update(book2);

    }
}
