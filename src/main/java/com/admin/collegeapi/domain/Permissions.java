package com.admin.collegeapi.domain;


import lombok.Data;

import javax.validation.constraints.NotNull;

@Data

public class Permissions {
    @NotNull
    private Integer permissionId;
    @NotNull
    private String PermissionName;
    @NotNull
    private String permissionDescription;
}
