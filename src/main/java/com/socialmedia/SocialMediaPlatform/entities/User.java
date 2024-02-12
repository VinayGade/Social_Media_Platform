package com.socialmedia.SocialMediaPlatform.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
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

    private String name;

    private int age;

    @OneToOne(
            //mappedBy = "user",
            cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="post_id")
    private Post post;

    //@JoinColumn(name="group_id")
    @OneToOne(
            mappedBy = "group",
            cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    private Group group;
}
