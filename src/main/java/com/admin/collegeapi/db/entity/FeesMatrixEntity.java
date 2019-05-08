package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Table(name="fees_matrix",schema = "college")
@Entity
public class FeesMatrixEntity {
    @Column(name ="fees_id",nullable = false)
    private String feesId;
    @Column(name = "year",nullable = false)
    private String year;
    @Column(name="dept_code",nullable = false)
    private String departmentCode;
    @Column(name="fees_type",nullable = false)
    private String feesType;
    @Column(name="fees_amount",nullable = false)
    private String feesAmount;
}
