package com.socialmedia.SocialMediaPlatform.repository;

import com.socialmedia.SocialMediaPlatform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}