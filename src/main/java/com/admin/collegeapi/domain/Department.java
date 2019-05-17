package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Department {
    @NotNull
    private String departmentCode;
    @NotNull
    private String departmentName;

}