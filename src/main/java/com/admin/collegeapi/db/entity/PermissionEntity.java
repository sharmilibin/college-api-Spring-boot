package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="permissions",schema = "college")
@Entity
public class PermissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name="permission_Id",nullable=false)
    private Integer permissionId;
    @Column(name="permission_name", nullable = false)
    private String permissionName;
    @Column(name="permission_description",nullable = false)
    private String permissionDescription;
}
