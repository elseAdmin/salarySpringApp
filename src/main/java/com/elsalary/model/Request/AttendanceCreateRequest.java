package com.elsalary.model.Request;

import lombok.Data;

@Data
public class AttendanceCreateRequest {
	private String month;
	private String year;
	private Long empId;
	private Long workingDays;
	private Long sickLeaves;
	private Long casualLeaves;
	private Long OtWorkingHours;
	private Long paidDays;
}
