package com.elsalary.model.Request.company;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@Valid
public class CompanyCreateRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String address;
    @NotEmpty
    private String phoneNo;
    @NotEmpty
    @Pattern(regexp="(^$|[0-9]{10})")
    private String mobileNo;
    @NotBlank
    private String contactPerson;
    @NotBlank
    @Email
    private String email;
    private String website;
    @NotEmpty
    private long userId;
}
