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
	Long departmentId;
	@Column
	Long companyId;
	@Column
	Long branchId;
	@Column
	String name;
	@Column
	String maritalStatus;
	@Column
	Long contact;
	@Column
	String address;
	@Column
	Date doj;
	@Column
	Long employeeId;
	@Column
	Long punchId;
	@Column
	Long basicSalary;
	@Column
	Long HRA;
	@Column
	Long variable;
	@Column
	String uan;
	@Column
	String pan;
	@Column
	String esic;
	@Column
	String aadhaar;
	@Column
	Long workingHours;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;
}
