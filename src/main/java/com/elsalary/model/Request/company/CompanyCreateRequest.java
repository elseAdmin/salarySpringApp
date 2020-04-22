package com.elsalary.model.Request.company;

import lombok.Data;

@Data
public class CompanyCreateRequest {
    private String name;
    private String address;
    private String phoneNo;
    private String email;
    private String website;
    private boolean isESICEnabled;
    private boolean isPFEnabled;
    private long userId;
}
