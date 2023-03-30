package com.example.mongoDB.demo.mongoDB.Controller;

import com.example.mongoDB.demo.mongoDB.DTO.BookDTO;
import com.example.mongoDB.demo.mongoDB.Model.Book;
import com.example.mongoDB.demo.mongoDB.Repository.BookRepository;
import com.example.mongoDB.demo.mongoDB.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/allBooks")
    public List<Book> allBooks(){
    return bookService.allBooks();}
    @GetMapping("/findByAuthorName")
    public List<Book> findByAuthorName(@RequestParam(value="name") String name){
    return bookService.findByAuthorName(name);
    }
    @PostMapping("/insertBook")
    public void insertBook(@RequestBody BookDTO createRequest){
        bookService.insertBook(createRequest);
    }
    @DeleteMapping("/deleteByName/{name}")
    public void deleteByName(@PathVariable String name)
    {
        bookService.deleteByName(name);
    }
    @DeleteMapping("/deleteAll")
    public void deleteAll(){bookService.deleteAll();}


    @PutMapping("/updateByName")
    public void updateByName(@RequestBody BookDTO createRequest){
      bookService.updateByName(createRequest);
    }




}

