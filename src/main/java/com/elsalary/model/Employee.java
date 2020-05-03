package com.elsalary.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
    @GeneratedValue
    private long id;
	@Column
	private Long employeeId;
	@Column
	private Long punchId;
	@Column
	private Long departmentId;
	@Column
	private Long companyId;
	@Column
	private Long branchId;
	@Column
	private String name;
	@Column
	private String fatherName;
	@Column
	private String motherName;
	@Column
	private String designation;
	@Column
	private String paymentMode;
	@Column
	private String regular;
	@Column
	private String empType;
	@Column
	private String salaryType;
	@Column
	private String labourWelfare;
	@Column
	private String epfStatus;
	@Column
	private String pensionStatus;
	@Column
	private String edliStatus;
	@Column
	private String esicStatus;
	@Column
	private String nonRegularPF;
	@Column
	private String nonRegularESIC;
	@Column
	private String pfSalaryLimit;
	@Column
	private String pfSalaryLimitEmployer;
	@Column
	private String esicSalaryLimit;
	@Column
	private String esicSalaryLimitEmployer;
	@Column
	private String uan;
	@Column
	private String pfNumber;
	@Column
	private String previousPfNumber;
	@Column
	private String esicNumber;
	@Column
	private String dispensary;
	@Column
	private String reasonOfQuit;
	@Column
	private String leftReason;
	@Column
	private String maritalStatus;
	@Column
	private String sex;
	@Column
	private String handicap;
	@Column
	private String typeOfHandi;
	@Column
	private String nationality;

	//Personal Info
	@Column
	private String qualification;
	@Column
	private Date dob;
	@Column
	private Date doj;
	@Column
	private Date doPF;
	@Column
	private Date doESIC;
	@Column
	private Date doLEFT;
	@Column
	private Date doRetire;
	@Column
	private int age;
	@Column
	private String incrementMonth;

	@Column
	private Long contact;
	@Column
	private String address;

	@Column
	private Long basicSalary;
	@Column
	private Long HRA;
	@Column
	private Long variable;

	// Id proof of employee 
	@Column
	private String pan;
	@Column
	private String aadhaar;
	@Column
	private Long workingHours;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;
}
