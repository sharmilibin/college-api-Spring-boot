package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class PhoneNumber {
    @NotNull
    private Integer phoneId;
    @NotNull
    private Integer studentId;
    @NotNull
    private Integer countryCode;
    @NotNull
    private String phoneType;
    @NotNull
    private Integer phoneNumber;
    @NotNull
    private Boolean active;
}
