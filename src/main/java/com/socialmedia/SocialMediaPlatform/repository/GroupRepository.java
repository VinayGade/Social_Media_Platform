package com.socialmedia.SocialMediaPlatform.repository;

import com.socialmedia.SocialMediaPlatform.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
}
