package com.codeup.matthew.services;

import com.codeup.matthew.Repositories.PostRepository;
import com.codeup.matthew.models.Post;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {

    private final PostRepository postDao;

    public PostService(PostRepository postDao){
        this.postDao = postDao;
    }


    public List<Post> all() {
        return (List<Post>) postDao.findAll();
    }

    public Post one(long id) {
        return postDao.findOne(id);
    }

    public long save(Post post){
        postDao.save(post);
        return post.getId();
    }

    public void delete(long id){
        postDao.delete(id);
    }

}
