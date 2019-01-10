package com.codeup.matthew.services;

import com.codeup.matthew.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;


    public PostService() {
        posts = new ArrayList<>();
        createPosts();
    }

    public List<Post> all() {
        return posts;
    }

    public Post create(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post one(long id) {
        return posts.get((int)id - 1);
    }

    public long edit(Post post){
        Post updatedPost = posts.get((int)post.getId() - 1);
        updatedPost.setBody(post.getBody());
        updatedPost.setTitle(post.getTitle());
        return updatedPost.getId();
    }

    public long save(Post post){
        post.setId(posts.size() + 1);
        posts.add(post);
        return post.getId();
    }

    private void createPosts() {
        Post test = new Post("My first post", "This is super informative post",0);
        Post test2 = new Post("My second post", "This is not an informative post", 0);
        Post test3 = new Post("My third post", "This is a terrible post", 0);
        create(test);
        create(test2);
        create(test3);
    }

}
