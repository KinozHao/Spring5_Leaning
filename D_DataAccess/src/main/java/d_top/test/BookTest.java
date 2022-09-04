package d_top.test;

import d_top.entity.Book;
import d_top.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/7/23 - 15:36
 * @apiNote 使用ClassPathXmlContextApplication
 * 2022/8/2 使用Junit替换
 */
@SpringJUnitConfig(locations = "classpath:druidConfig.xml")
public class BookTest {
    @Autowired
    public BookService bs;

    @Test
    public void cmdTest(){
        //增加操作
        final Book book = new Book();
        book.setId(100);
        book.setName("背包十年");
        book.setMoney(39.5);
        book.setPassword("123456");
        bs.addBook(book);

        //删除操作
        //bs.delBook("8");

        //修改操作
        final Book book2 = new Book();
        book2.setId(8);
        book2.setName("骆驼祥子");
        book2.setMoney(19.5);
        book2.setPassword("123456");
        //bs.updateBook(book2);

    }
    @Test
    public void queryTest(){
        //查询数据总数
        //bs.queryCount();

        //查询返回对象
        final Book one = bs.findOne("2");
        //System.out.println(one);

        //查询返回集合(所有数据)
        final List<Book> allBook = bs.findAll();
        //allBook.forEach(System.out::println);
    }


    @Test
    public void multipleTest() {
        //批量添加
        List<Object[]> list = new ArrayList<>();
        Object[] o1 = {"9", "数据结构", 29.5, "123456"};
        Object[] o2 = {"10", "数据库原理", 49.9, "123456"};
        Object[] o3 = {"11", "操作系统", 47.5, "123456"};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        //bs.batchAdd(list);

        //批量修改
        List<Object[]> list2 = new ArrayList<>();
        Object[] b1 = {"工业互联网预测维护", 29.5, "123456", "10"};
        Object[] b2 = {"工商管理", 49.9, "123456", "11"};
        list2.add(b1);
        list2.add(b2);
        //bs.batchUpdate(list2);

        //批量删除
        List<Object[]> list3 = new ArrayList<>();
        Object[] j1 = {"10"};
        Object[] j2 = {"11"};
        list3.add(j1);
        list3.add(j2);
        //bs.batchDel(list3);
    }
}
