package com.codeup.matthew.controllers;

import com.codeup.matthew.models.Post;
import com.codeup.matthew.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //See All Posts
    @GetMapping("/posts")
    public String index(Model model){
        model.addAttribute("posts", postService.all());
        return "posts/index";
    }

    //See One Post
    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model){
        model.addAttribute("post", postService.one(id));
        return "posts/show";
    }

    //Delete Post
    @PostMapping("/posts/{id}")
    public String deletePost(@PathVariable long id){
        postService.delete(id);
        return "redirect:/posts";
    }

    //Edit Post Form
    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable long id, Model model){
        model.addAttribute("edit", true);
        model.addAttribute("post", postService.one(id));
        return "posts/create-edit";
    }

    //Submit Form Edit
    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post){
        String idString = String.valueOf(postService.save(post));
        return "redirect:/posts/" + idString;
    }

    //Create Post Page
    @GetMapping("/posts/create")
    public String createForm(Model model){
        model.addAttribute("create", true);
        model.addAttribute("post", new Post());
        return "posts/create-edit";
    }

    //Submit Post Creation
    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        String idString = String.valueOf(postService.save(post));
        return "redirect:/posts/" + idString;
    }

}
