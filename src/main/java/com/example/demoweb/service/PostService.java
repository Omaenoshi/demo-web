package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        return Arrays.asList(new Post("Hello. I am Maxim."), new Post("Who am I?"), new Post("What is your name?"));
    }
}
