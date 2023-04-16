package com.graphql.service;

import com.graphql.entity.Post;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  @Value("classpath:post.graphqls")
  private Resource schemaResource;



  public List<Post> getPosts() {
    List<Post> postList = new ArrayList<>();
    Post post = new Post();
    post.setPostId(1);
    post.setDescription("name");
    postList.add(post);
    return postList;
  }

}
