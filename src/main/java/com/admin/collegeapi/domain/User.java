package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class User {
    @NotEmpty
    private String name;
    @Min(17)
    private Integer age;
    @NotNull
    private Gender gender;
    @NotNull
    private Date dob;
    @NotEmpty
    @Email
    private String email;
    @NotNull
    private Department department;
    @NotNull
    private Role userType;

}





