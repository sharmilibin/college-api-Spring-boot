package com.admin.collegeapi.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Role {

    @NotNull
    private String roleName;
    @NotNull
    private String roleDescription;

}
