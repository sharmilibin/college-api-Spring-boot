package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="role",schema = "college")
@Entity
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name="role_id",nullable = false)
    private Integer roleId;
    @Column(name="role_name",nullable = false)
    private String roleName;
    @Column(name="role_description",nullable = false)
    private String roleDescription;

}
