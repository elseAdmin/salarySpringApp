package com.elsalary.model.Request;

import lombok.Data;

@Data
public class BranchCreateRequest {
	Long companyId;
	Long createdByUserId;
	String name;
	String address;
	String email;
	String contactPerson;
	String phone;
}
