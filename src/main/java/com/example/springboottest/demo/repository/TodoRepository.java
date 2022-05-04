package com.example.springboottest.demo.repository;

import com.example.springboottest.demo.model.Todo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
