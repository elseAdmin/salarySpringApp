package com.elsalary.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String month;
	@Column
	private String year;
	@Column
	private Long empId;
	@Column
	private Long workingDays;
	@Column
	private Long sickLeaves;
	@Column
	private Long casualLeaves;
	@Column
	private Long OtWorkingHours;
	@Column
	private Long paidDays;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	private Date createDate;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date")
	private Date modifyDate;
}
