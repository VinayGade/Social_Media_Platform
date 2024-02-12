package com.socialmedia.SocialMediaPlatform.service;

import com.socialmedia.SocialMediaPlatform.entities.Post;
import com.socialmedia.SocialMediaPlatform.entities.User;

import java.util.List;

public interface PostService {

    void save(Post post);
    List<Post> findAll();
    Post findById(int id);
    void update(Post post);
    void delete(int id);

}
