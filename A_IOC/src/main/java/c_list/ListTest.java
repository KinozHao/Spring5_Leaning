package c_list;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kinoz
 * @Date 2022/7/17 - 18:37
 * @apiNote 注入集合属性|提取集合属性
 */
public class ListTest {
    @Test
    public void cTest1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ListBean.xml");
        ListInjection list = context.getBean("list", ListInjection.class);
        list.listData();
    }

    @Test
    public void BookTest(){
        ApplicationContext con = new ClassPathXmlApplicationContext("ListBean.xml");
        Course book = con.getBean("book", Course.class);
        Course book2 = con.getBean("book", Course.class);
        book.bookList();
        //判断是单个实例还是多个实例
        System.out.println(book.hashCode());
        System.out.println(book2.hashCode());
    }
    @Test
    public void GzTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ListBean.xml");
        Course gc = context.getBean("gc", Course.class);
        System.out.println(gc);
    }

}
