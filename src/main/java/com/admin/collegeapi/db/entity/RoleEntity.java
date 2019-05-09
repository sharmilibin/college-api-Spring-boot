package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name="roles",schema = "college")
@Entity
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id",nullable = false)
    private Integer roleId;
    @Column(name="role_name",nullable = false)
    private String roleName;
    @Column(name="role_description",nullable = false)
    private String roleDescription;

    @OneToMany(
            mappedBy = "role",
            cascade = CascadeType.MERGE,
            orphanRemoval = true
    )
    private List<UserEntity> users = new ArrayList<>();
}
