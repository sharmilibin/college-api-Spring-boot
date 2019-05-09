package com.admin.collegeapi.domain;


import lombok.Data;

import javax.validation.constraints.NotNull;

@Data

public class FeesPaid {
    @NotNull
    private Integer feesPaidID;
    @NotNull
    private Integer studentID;
    @NotNull
    private Integer feesId;
    @NotNull
    private Integer paidAmount;


}
