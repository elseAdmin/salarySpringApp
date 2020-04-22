package com.elsalary.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String phoneNo;
    @Column
    private String email;
    @Column
    private String website;
    @Column
    private Boolean isESICEnabled;
    @Column
    private Boolean isPFEnabled;
}
