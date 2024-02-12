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
@Entity(name="post_tbl")
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="post_id")
    private int id;

    private String caption;
    //private List<User> users;

    private int likes;

    private List<String> comments;

    @OneToOne(mappedBy = "post")
    private Group group;
}
