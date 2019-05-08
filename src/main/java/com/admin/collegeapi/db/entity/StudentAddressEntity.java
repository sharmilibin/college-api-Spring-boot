package com.admin.collegeapi.db.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="student_address",schema = "college")
@Entity
public class StudentAddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "")
    @Column(name="address_id",nullable = false)
    private Integer addressId;
    @Column(name = "student_id",nullable = false)
    private Integer studentId;
    @Column(name = "line_1",nullable = false)
    private String line1;
    @Column(name = "line_2")
    private String line2;
    @Column(name="city",nullable = false)
    private String city;
    @Column(name="state",nullable = false)
    private String state;
    @Column(name = "country",nullable = false)
    private String country;
    @Column(name="zip_code",nullable = false)
    private Integer zipCode;
    @Column(name="address_type",nullable = false)
    private String addressType;
    @Column(name="active",nullable = false)
    private Boolean active;

}
