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
public class Branch {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String mobile;
    @Column
    private String email;
    @Column
    private String contactPerson;
    @Column
    private String firmPfNumber;
    @Column
    private String pfGroupCode;
    @Column
    private String pfOffice;
    @Column
    private String firmEsicNumber;
    @Column
    private String esicGroupCode;
    @Column
    private String esicOffice;
    @Column
    private String otFormula;
    @Column
    private String otRate;
    @Column
    private String esiOnOt;
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
