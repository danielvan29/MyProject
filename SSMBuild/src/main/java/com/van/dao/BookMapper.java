package com.van.dao;

import com.van.pojo.Books;

import java.util.List;

public interface BookMapper {

    int addBook(Books books);

    int deleteBook(int id);

    int updateBook(Books books);

    Books queryBook(int id);

    List<Books> queryBooks();

}
