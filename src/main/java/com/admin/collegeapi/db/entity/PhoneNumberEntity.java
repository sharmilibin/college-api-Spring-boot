package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="phone_number",schema = "college")
@Entity
public class PhoneNumberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name="phone_id",nullable = false)
    private Integer phoneId;
    @Column(name="student_id",nullable = false)
    private Integer studentId;
    @Column(name = "country_code",nullable = false)
    private Integer countryCode;
    @Column(name="phone_type",nullable = false)
    private String phoneType;
    @Column(name="Phone_number",nullable = false)
    private Integer phoneNumber;
    @Column(name="active",nullable = false)
    private Boolean active;
}
