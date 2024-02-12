package com.socialmedia.SocialMediaPlatform.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@Entity
@Table(name="group_tbl")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Group {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="group_id")
    private int id;

    private String title;

    @OneToOne(
            //mappedBy = "group",
            cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name="user_id")
    private User user;
}
