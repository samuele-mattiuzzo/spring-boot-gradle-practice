package com.example.springboottest.demo.model;

import org.springframework.data.annotation.Id;

public class Todo {

    @Id
    private String id;

    private String title;

    private Boolean completed;

    public Todo(String title, Boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCompleted() {
        return completed;
    }
}
