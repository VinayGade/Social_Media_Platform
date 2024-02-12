package com.socialmedia.SocialMediaPlatform.service;

import com.socialmedia.SocialMediaPlatform.entities.Group;
import com.socialmedia.SocialMediaPlatform.entities.User;
import com.socialmedia.SocialMediaPlatform.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public void save(Group group) {
        groupRepository.save(group);
    }

    @Override
    public Group findById(int id) {
        return groupRepository.findById(id).get();
    }

    @Override
    public void update(Group group) {
        groupRepository.save(group);
    }

    @Override
    public void delete(int id) {
        groupRepository.delete(groupRepository.findById(id).get());
    }
}
