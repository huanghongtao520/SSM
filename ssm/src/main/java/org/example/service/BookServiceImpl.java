package org.example.service;

import org.example.dao.BookMapper;
import org.example.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    //service层调dao层，组合Dao
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void deleteBook(int bookID) {
        bookMapper.deleteBook(bookID);
    }

    @Override
    public List<Book> queryOneBook(int bookID) {
        return bookMapper.queryOneBook(bookID);
    }

    @Override
    public List<Book> queryAll() {
        return bookMapper.queryAll();
    }
}
