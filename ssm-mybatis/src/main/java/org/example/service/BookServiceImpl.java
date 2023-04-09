package org.example.service;

import org.example.dao.BookMapper;
import org.example.pojo.Book;

import java.util.List;

public class BookServiceImpl implements BookService{
    //service层调dao层，组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void deleteBook(int bookID) {
        bookMapper.deleteBook(bookID);
    }

    @Override
    public Book queryOneBook(int bookID) {
        return bookMapper.queryOneBook(bookID);
    }

    @Override
    public List<Book> queryAll() {
        return bookMapper.queryAll();
    }
}
