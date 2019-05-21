package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="fees_matrix",schema = "college")
@Entity
public class FeesMatrixEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "fees_matrix_fees_id_seq")
    @Column(name ="fees_id",nullable = false)
    private Integer feesId;
    @Column(name = "year",nullable = false)
    private Integer year;
    @Column(name="dept_code",nullable = false)
    private String departmentCode;
    @Column(name="fees_type",nullable = false)
    private String feesType;
    @Column(name="fees_amount",nullable = false)
    private Integer feesAmount;
}
