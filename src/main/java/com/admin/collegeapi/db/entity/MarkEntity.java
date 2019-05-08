package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "marks",schema = "college")
@Entity
public class MarkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    private Integer id;
   @Column(name="student_id",nullable =false)
    private Integer studentId;
    @Column(name="subject_code", nullable=false)
    private String subjectCode;
    @Column(name="marks_obtained",nullable=false)
    private Integer marksObtained;
    @Column(name="marks_total",nullable = false)
    private Integer marksTotal;
    @Column(name="exam_type",nullable = false)
    private String examType;
    @Column(name="semester",nullable=false)
    private Integer semester;
    @Column(name ="year",nullable = false)
    private Integer year;
}
