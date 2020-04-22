package com.elsalary.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;
}
