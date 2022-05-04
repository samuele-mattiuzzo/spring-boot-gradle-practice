package com.example.springboottest.demo.controller;

import java.util.List;

import com.example.springboottest.demo.model.Todo;
import com.example.springboottest.demo.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    @Autowired
    private TodoService toDoService;

    @GetMapping
    public List<Todo> findAll() {
        return toDoService.findAll();
    }

    @GetMapping("/{id}")
    public Todo findById(@PathVariable String id) {
        return toDoService.findById(id);
    }

    @PostMapping
    public Todo create(@RequestBody Todo toDo) {
        return toDoService.save(toDo);
    }

    @PutMapping("/{id}")
    public Todo update(@RequestBody Todo toDo) {
        return toDoService.save(toDo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        toDoService.deleteById(id);
    }

}
