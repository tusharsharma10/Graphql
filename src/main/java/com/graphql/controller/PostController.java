package com.graphql.controller;

import com.graphql.entity.Post;
import com.graphql.service.PostService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {

  @Autowired
  PostService postService;

  @QueryMapping
  public List<Post> getAllPosts() {
    return postService.getPosts();
  }

}
