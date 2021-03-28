package com.van.service.impl;

import com.van.dao.BookMapper;
import com.van.pojo.Books;
import com.van.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBook(int id) {
        return bookMapper.queryBook(id);
    }

    public List<Books> queryBooks() {
        return bookMapper.queryBooks();
    }
}
