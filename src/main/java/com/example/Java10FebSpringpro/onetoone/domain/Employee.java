package com.example.Java10FebSpringpro.onetoone.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private  String name;
    private  String address;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonManagedReference
    private  SalaryAccount salaryAccount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
