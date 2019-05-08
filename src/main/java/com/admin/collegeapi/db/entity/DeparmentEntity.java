package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name = "department",schema = "college")
@Entity

public class DeparmentEntity {

    @Column(name ="dept_code",nullable = false)
    private Integer departmentCode;
    @Column(name ="dept_name",nullable = false)
    private String departmentName;

}
