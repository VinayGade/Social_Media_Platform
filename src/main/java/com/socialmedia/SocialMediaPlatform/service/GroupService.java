package com.socialmedia.SocialMediaPlatform.service;

import com.socialmedia.SocialMediaPlatform.entities.Group;
import com.socialmedia.SocialMediaPlatform.entities.User;

public interface GroupService {

    void save(Group group);
    User findById(int id);
    void update(Group group);
    void delete(int id);
}
