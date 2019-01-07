package com.codeup.matthew.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/posts")
    public String index(){
        return "Here are all the Posts";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id){
        return "Here is the post for " + id;
    }

    @GetMapping("/posts/create")
    public String createForm(){
        return "Create a new post";
    }

    @PostMapping("/posts/create")
    public String createPost(){
        return "post created";
    }

}
