package com.codeup.matthew.controllers;

import com.codeup.matthew.models.Post;
import com.codeup.matthew.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public String index(Model model){
        model.addAttribute("posts", postService.all());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model){
        model.addAttribute("post", postService.one(id));

        return "posts/show";
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
