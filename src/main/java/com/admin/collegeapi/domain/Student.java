package com.admin.collegeapi.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class Student {

    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String about;
    @NotNull
     private Date dateOfBirth;
    @NotNull
    private String departmentCode;

    private Integer yearOfJoining;
    @NotNull
    private String gender;
    private  Integer userId;



}
