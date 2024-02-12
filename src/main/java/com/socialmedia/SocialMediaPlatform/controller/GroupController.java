package com.socialmedia.SocialMediaPlatform.controller;

import com.socialmedia.SocialMediaPlatform.entities.Group;
import com.socialmedia.SocialMediaPlatform.entities.Post;
import com.socialmedia.SocialMediaPlatform.service.GroupService;
import com.socialmedia.SocialMediaPlatform.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping("/groups")
    public List<Group> findAll() {
        return groupService.findAll();
    }

    @PostMapping("/groups")
    public void save(@RequestBody Group group){
        groupService.save(group);
    }

    @GetMapping("/groups/{id}")
    public Group find(@PathVariable int id){
        return groupService.findById(id);
    }

    @DeleteMapping("/groups/{id}")
    public void delete(@PathVariable int id){
        groupService.delete(id);
    }

    @PutMapping("/groups")
    public void update(@RequestBody Group group){
        groupService.save(group);
    }
}
