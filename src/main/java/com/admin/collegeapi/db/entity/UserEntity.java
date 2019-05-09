package com.admin.collegeapi.db.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Table(name = "user", schema = "college")
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "user_user_id_seq")
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleEntity role;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user", fetch = FetchType.LAZY)
    private StudentEntity studentEntity;
}
