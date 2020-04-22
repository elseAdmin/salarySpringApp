package com.elsalary.model.Request;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeCreateRequest {
	Long departmentId;
	Long companyId;
	Long branchId;
	String name;
	String maritalStatus;
	Long contact;
	String address;
	Date doj;
	Long employeeId;
	Long punchId;
	Long basicSalary;
	Long HRA;
	Long variable;
	String uan;
	String pan;
	String esic;
	String aadhaar;
	Long workingHours;

}
