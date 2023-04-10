package org.example.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.example.pojo.Book;
import org.example.service.BookService;
import org.example.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //从controller调用service层

/*   (1）注入的就是实现类，只不过拿接口来接收，接收的类型为接口，
    面向接口编程，那么为何要面向接口编程？这就涉及到使用接口做
    代理，因为通过@autowired的对象是通过接口的方式会使用jdk
    动态代理，jdk动态代理只能对实现接口的类生成代理，而不能针
    对类。
    (2）注入的是实现类对象，接收的是接口；理解为多态；*/
    @Autowired
    private BookService bookService;

    //查询全部书籍
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Book> books=bookService.queryAll();
        model.addAttribute("books",books);
        return "allBook";
    }

    //添加书籍
    @RequestMapping("/addBook")
    public String addBook(Book book){
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    //删除
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable int bookID){
        System.out.println(bookID);
        bookService.deleteBook(bookID);
        return "redirect:/book/allBook";
    }

    //查询
    @RequestMapping("/queryOneBook")
    public String queryOneBook(int bookID, Model model){
        List<Book> books= bookService.queryOneBook(bookID);
        if (books.isEmpty())
            return "redirect:/book/allBook";
        //如果查询为空，则显示全部数据
        model.addAttribute("books",books);
        return "allBook";
    }

}
