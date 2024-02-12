package com.socialmedia.SocialMediaPlatform.service;

import com.socialmedia.SocialMediaPlatform.entities.Post;
import com.socialmedia.SocialMediaPlatform.entities.User;
import com.socialmedia.SocialMediaPlatform.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(int id) {
        Post post = postRepository.findById(id).get();
        return post;
    }

    @Override
    public void update(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(int id) {
        postRepository.delete(postRepository.findById(id).get());
    }
}
