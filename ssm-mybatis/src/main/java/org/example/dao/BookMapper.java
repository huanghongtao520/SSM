package org.example.dao;

import org.example.pojo.Book;

import java.util.List;

public interface BookMapper {
    void addBook(Book book);
    void deleteBook(int bookID);
    List<Book> queryOneBook(int bookID);
    List<Book> queryAll();
}
