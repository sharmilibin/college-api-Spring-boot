package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Mark{
    @NotNull
    private Integer studentId;
    @NotNull
    private String subjectCode;
    @NotNull
    private Integer marksObtained;
    @NotNull
    private Integer marksTotal;
    @NotNull
    private String examType;
    @NotNull
    private Integer year;
    @NotNull
    private Integer semester;

}
