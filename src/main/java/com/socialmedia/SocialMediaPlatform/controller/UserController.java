package com.socialmedia.SocialMediaPlatform.controller;

import com.socialmedia.SocialMediaPlatform.entities.User;
import com.socialmedia.SocialMediaPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void save(User user){
        userService.save(user);
    }

    @GetMapping("/users/{id}")
    public User find(int id){
        return userService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public void delete(int id){
        userService.delete(id);
    }

}
