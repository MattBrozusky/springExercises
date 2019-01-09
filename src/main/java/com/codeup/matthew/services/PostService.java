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

//    public Ad create(Ad ad) {
//        ad.setId(ads.size() + 1);
//        ads.add(ad);
//        return ad;
//    }

    public Post one(long id) {
        int postId = (int) id;
        return posts.get(postId - 1);
    }

    private void createPosts() {
        Post test = new Post("My first post", "This is super informative post",1);
        Post test2 = new Post("My second post", "This is not an informative post", 2);
        Post test3 = new Post("My third post", "This is a terrible post", 3);
        posts.add(test);
        posts.add(test2);
        posts.add(test3);
    }


}
