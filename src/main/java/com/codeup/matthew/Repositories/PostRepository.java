package com.codeup.matthew.Repositories;

import com.codeup.matthew.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}