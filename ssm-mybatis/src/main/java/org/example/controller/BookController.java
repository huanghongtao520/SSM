package org.example.controller;

import org.example.pojo.Book;
import org.example.service.BookService;
import org.example.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //从controller调用service层
    //不能直接装配bookService，否则查询不出数据

    private BookService bookService=new BookServiceImpl();

    //查询全部书籍
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Book> books=bookService.queryAll();
        for (Book book:books)
            System.out.println(book);
        System.out.println("11111111111");
        model.addAttribute("books",books);
        return "allBook";
    }

}
