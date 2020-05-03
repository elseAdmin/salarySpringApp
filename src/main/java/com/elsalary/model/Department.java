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
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String addressPrincipleEmployee;
    @Column
    private String principleEmployee;
    @Column
    private String location;
    @Column
    private String contractorName;
    @Column
    private String contractorAddress;
    @Column
    private String subContName;
    @Column
    private String subContAddress;
    @Column
    private String mainContName;
    @Column
    private String mainContAddress;
    @Column
    private String state;
    @Column
    private String lwfStatus;
    @Column
    private String pTaxStatus;
    @Column
    private String surchargePercentage;
    @Column
    private String surcharge;
    // New tac was there for this
    @Column
    private String pfChallanAddress;
    //New tab for esic detail
    @Column
    private String esicChallanAddress;
    @Column
    private String esicNumber;
    @Column
    private String esicGroupCode;
    @Column
    private String esicOffice;
    //New tab for overtime
    @Column
    private String otPercent;
    @Column
    private String esicOnOT;
    @Column
    private String pfOnOT;
    @Column
    private String formulaOT;
    @Column
    private String settingOT;
    @Column
    private String lwfSettings;
    @Column
    private String lwfFormula;
    @Column
    private String code;
    @Column
    private Long branchId;
    @Column
    private Long companyId;
    @Column
    private Long createdByUserId;
    
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;
}
