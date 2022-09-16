package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts;

    public PostService() {
        posts = new ArrayList<>();
        posts.add(new Post(0, "Hello. I am Maxim."));
        posts.add(new Post(1, "Who am I?"));
        posts.add(new Post(2, "What is your name?"));

    }
    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(posts.size(), text));
    }
}
