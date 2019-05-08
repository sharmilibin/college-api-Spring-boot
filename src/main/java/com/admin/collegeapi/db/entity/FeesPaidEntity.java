package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="fees_paid",schema = "college")
public class FeesPaidEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name ="fees_paid_id", nullable=false )
    private Integer feesPaidId;
    @Column(name="student_id",nullable = false)
    private Integer studentId;
    @Column(name ="fees_id",nullable = false)
    private Integer feesId;
    @Column(name="paid_amount",nullable=false)
    private Integer paidAmount;
}
