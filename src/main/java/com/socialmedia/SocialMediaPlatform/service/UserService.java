package com.socialmedia.SocialMediaPlatform.service;

import com.socialmedia.SocialMediaPlatform.entities.User;
import com.socialmedia.SocialMediaPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

public interface UserService {

    void save(User user);
    List<User> findAll();
    User findById(int id);
    void update(User user);
    void delete(int id);

}
