package com.example.mongoDB.demo.mongoDB.Service;

import com.example.mongoDB.demo.mongoDB.DTO.BookDTO;
import com.example.mongoDB.demo.mongoDB.Model.Book;
import com.example.mongoDB.demo.mongoDB.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<Book> allBooks(){
        return bookRepository.findAll();}
    public List<Book> findByAuthorName( String name){
        return bookRepository.findByAuthorName(name);
    }
    public void insertBook(BookDTO createRequest){
        Book book = new Book();
        book.setCost(createRequest.getCost());
        book.setName(createRequest.getName());
        book.setAuthorName(createRequest.getAuthorName());
        bookRepository.save(book);
    }
    public void deleteByName( String name){
        bookRepository.deleteByName(name);
    }
    public void deleteAll(){bookRepository.deleteAll();}
    public void updateByName(BookDTO createRequest){
        Book b = bookRepository.findByName(createRequest.getName());
        b.setAuthorName(createRequest.getAuthorName());
        b.setCost(createRequest.getCost());
        bookRepository.save(b);
    }
    }


