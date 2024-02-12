package com.socialmedia.SocialMediaPlatform.controller;

import com.socialmedia.SocialMediaPlatform.entities.Post;
import com.socialmedia.SocialMediaPlatform.entities.User;
import com.socialmedia.SocialMediaPlatform.service.PostService;
import com.socialmedia.SocialMediaPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/employees")
    public List<Post> findAll() {
        return postService.findAll();
    }

    @PostMapping("/posts")
    public void save(Post post){
        postService.save(post);
    }

    @GetMapping("/posts/{id}")
    public Post find(int id){
        return postService.findById(id);
    }

    @DeleteMapping("/posts/{id}")
    public void delete(int id){
        postService.delete(id);
    }

    @PutMapping("/posts")
    public void update(Post post){
        postService.save(post);
    }

}
