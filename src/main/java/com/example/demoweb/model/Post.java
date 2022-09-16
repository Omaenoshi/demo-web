package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private final String text;
    private long id;
    private int likes;

    private final Date creationDate;

    public Post(long id, String text) {
        this.id = id;
        this.text = text;
        this.creationDate = new Date();
    }

    public long getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
