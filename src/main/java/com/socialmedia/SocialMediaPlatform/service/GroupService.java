package com.socialmedia.SocialMediaPlatform.service;

import com.socialmedia.SocialMediaPlatform.entities.Group;
import com.socialmedia.SocialMediaPlatform.entities.Post;
import com.socialmedia.SocialMediaPlatform.entities.User;

import java.util.List;

public interface GroupService {

    List<Group> findAll();
    void save(Group group);
    Group findById(int id);
    void update(Group group);
    void delete(int id);
}
