package com.elsalary.model.Request;

import lombok.Data;

@Data
public class UserAdminDto {
    private String username;
    private String password;
    private String role;
}
