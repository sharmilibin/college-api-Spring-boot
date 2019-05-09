package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotEmpty
    private String name;
    @NotEmpty
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
    private RoleEnum role;

}





