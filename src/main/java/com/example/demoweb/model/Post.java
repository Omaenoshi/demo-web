package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private final String text;
    private int likes;

    private final Date creationDate;

    public Post(String text) {
        this.text = text;
        creationDate = new Date();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
