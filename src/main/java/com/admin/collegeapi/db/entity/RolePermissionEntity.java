package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="role_permission",schema = "college")
@Entity
public class RolePermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name ="role_permission_id",nullable = false)
    private Integer rolePermissionId;
    @Column(name="role_id",nullable = false)
    private Integer roleId;
    @Column(name="permission_id",nullable = false)
    private Integer permissionId;
}
