package com.elsalary.model.Request;

import lombok.Data;

@Data
public class BranchCreateRequest {
	Long companyId;
	String createdByUserId;
	String name;
	String address;
	String email;
	String contactPerson;
}
