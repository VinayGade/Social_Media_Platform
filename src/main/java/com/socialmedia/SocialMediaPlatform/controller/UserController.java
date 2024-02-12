package com.socialmedia.SocialMediaPlatform.controller;

import com.socialmedia.SocialMediaPlatform.entities.Group;
import com.socialmedia.SocialMediaPlatform.entities.User;
import com.socialmedia.SocialMediaPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userService.save(user);
    }

    @GetMapping("/users/{id}")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User find(@PathVariable int id){
        return userService.findById(id);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable int id){
        userService.delete(id);
    }

    @PutMapping("/users")
    public void update(@RequestBody User user){
        userService.save(user);
    }

}
