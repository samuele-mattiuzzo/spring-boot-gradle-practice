package com.example.springboottest.demo.service;

import java.util.List;

import com.example.springboottest.demo.exception.EntityNotFoundException;
import com.example.springboottest.demo.model.Todo;
import com.example.springboottest.demo.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository toDoRepository;

    public List<Todo> findAll() {
        return toDoRepository.findAll();
    }

    public Todo findById(String id) {
        return toDoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Todo save(Todo toDo) {
        return toDoRepository.save(toDo);
    }

    public void deleteById(String id) {
        toDoRepository.deleteById(id);
    }

}
