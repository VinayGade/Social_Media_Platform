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
@Entity
@Table(name="post_tbl")
public class Post {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="post_id")
    private int id;

    private String caption;
    //private List<User> users;

    private int likes;

    private List<String> comments;

    //@JoinColumn(name="group_id")
    @OneToOne(
            mappedBy = "post",
            cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    private Group group;
}
