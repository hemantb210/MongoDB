package com.example.mongoDB.demo.mongoDB.Controller;

import com.example.mongoDB.demo.mongoDB.CreateRequest.CreateRequest;
import com.example.mongoDB.demo.mongoDB.DAO.Book;
import com.example.mongoDB.demo.mongoDB.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
//    @Autowired
//    private BookRepository bookRepository;
//
//    @GetMapping("/allBooks")
//    public List<Book> allBooks(){
//    return bookRepository.findAll();}
////    @GetMapping("/findByAuthorName")
////    public List<Book> findByAuthorName(@RequestParam(value="name") String name){
////    return bookRepository.findByAuthorName(name);
////    }
//    @PostMapping("/insertBook")
//    public void insertBook(@RequestBody CreateRequest createRequest){
//        Book book = new Book();
//        book.setCost(createRequest.getCost());
//        book.setName(createRequest.getName());
//        book.setAuthorName(createRequest.getAuthorName());
//        bookRepository.save(book);
//    }
//    @DeleteMapping("/deleteById")
//    public void deleteById(@RequestParam(value="id") int id){
//        bookRepository.deleteById(id);
//    }
//    @PutMapping("/updateById")
//    public void updateById(@RequestBody CreateRequest createRequest){
//      Book b = bookRepository.findByName(createRequest.getName());
//      b.setAuthorName(createRequest.getAuthorName());
//      b.setCost(createRequest.getCost());
//      bookRepository.save(b);
//    }




}

