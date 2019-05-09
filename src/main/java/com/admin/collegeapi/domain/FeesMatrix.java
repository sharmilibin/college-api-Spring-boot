package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class FeesMatrix {
    @NotNull
    private Integer feesId;
    @NotNull
    private Integer year;
    @NotNull
    private String departmentCode;
    @NotNull
    private String feesType;
    @NotNull
    private Integer feesAmount;

}
