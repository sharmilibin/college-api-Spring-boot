package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "department",schema = "college")
@Entity

public class DepartmentEntity {

    @Id
    @Column(name ="dept_code",nullable = false)
    private Integer departmentCode;
    @Column(name ="dept_name",nullable = false)
    private String departmentName;


    @OneToMany(
            mappedBy = "department",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<StudentEntity> students = new ArrayList<>();
}
