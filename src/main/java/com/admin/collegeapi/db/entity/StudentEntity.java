package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "student",schema = "college")
@Entity


public class StudentEntity {


    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "about ", nullable = false)
    private String about;
    @Column(name = "email" ,nullable = false)
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "student_student_id_seq")
    @Column(name ="student_id",nullable = false)
    private Integer student_id;

}
