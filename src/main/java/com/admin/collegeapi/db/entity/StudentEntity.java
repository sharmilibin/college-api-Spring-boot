package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "student_student_id_seq")
    @Column(name ="student_id",nullable = false)
    private Integer student_id;

    @Column(name = "date_of_birth", nullable = false)
    private Date dataOfBirth;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_code")
    private DepartmentEntity department;

    @Column(name = "year_of_joining", nullable = false)
    private Integer yearOfJoining;

    @Column
    private String gender;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

}
