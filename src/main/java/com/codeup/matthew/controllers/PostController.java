package com.codeup.matthew.controllers;

import com.codeup.matthew.beans.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String index(Model model){


        Post test = new Post("My first post", "This is super informative post",1);
        Post test2 = new Post("My second post", "This is not an informative post", 2);
        Post test3 = new Post("My third post", "This is a terrible post", 3);
        ArrayList<Post> postsList = new ArrayList<Post>();
        postsList.add(test);
        postsList.add(test2);
        postsList.add(test3);

        model.addAttribute("posts", postsList);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model){
        Post test = new Post("My first post", "This is super informative post",1);
        model.addAttribute("post", test);

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
