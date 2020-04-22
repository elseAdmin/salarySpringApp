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
    private boolean isESICEnabled;
    @Column
    private boolean isPFEnabled;
    @Column
    private long userId;
}
