package com.example.webdom6.models;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Post {

    private int id;
    private User author;
    private String title;
    private String content;
    private final List<Comment> comments = new CopyOnWriteArrayList<>();

    public Post(int id, User author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
