import org.example.dao.BookMapper;
import org.example.pojo.Book;
import org.example.service.BookService;
import org.example.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void myTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookService = (BookServiceImpl) context.getBean("bookServiceImpl");
        List<Book> books = bookService.queryAll();
        for (Book book:books)
            System.out.println(book);
    }
}
