package com.van.controller;

import com.van.pojo.Books;
import com.van.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBooks")
    public String list(Model model) {
        System.out.println("Books");
        List<Books> books = bookService.queryBooks();
        for (Books book : books) {
            System.out.println(book);
        }
        return "books";
    }
}
