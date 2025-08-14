package com.alt.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="userinfo")
@Data
public class UserEntity {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinColumn(name="profile_id")
    private ProfileEntity profile;

}
