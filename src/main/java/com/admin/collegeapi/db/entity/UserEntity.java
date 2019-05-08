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

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String department;
}
