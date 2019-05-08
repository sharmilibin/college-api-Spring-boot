package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="student_amenities",schema = "college")
@Entity

public class StudentAmenities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name="amenity_id",nullable = false)
    private Integer amenityId;
    @Column(name = "student_id",nullable = false)
    private Integer studentId;
    @Column(name="amenity",nullable = false)
    private String amenity;
    @Column(name="year",nullable = false)
    private Integer year;


}
