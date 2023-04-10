package org.example.service;

import org.example.pojo.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    void deleteBook(int bookID);
    List<Book> queryOneBook(int bookID);
    List<Book> queryAll();
}
