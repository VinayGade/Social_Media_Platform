package com.socialmedia.SocialMediaPlatform.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
@Entity(name="user_tbl")
public class User {

    /*
    Browse a feed/timeline of posts from groups they have joined
Post inside a group and browse this group’s posts
Like on a post
Comment on a post
    * */

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @OneToOne(mappedBy = "user")
    @Column(name="post")
    private Post post;

    private Group group;
}
