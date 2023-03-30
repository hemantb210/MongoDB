package com.example.mongoDB.demo.mongoDB.Repository;

import com.example.mongoDB.demo.mongoDB.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,Integer> {
public List<Book> findByAuthorName(String name);
public Book findByName(String name);
public void deleteByName(String name);
}
