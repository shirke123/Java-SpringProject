package com.example.Java10FebSpringpro.onetoone.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

@Entity
public class SalaryAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id;
    private  Long AccountNumber;
    private  String ifsccode;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "emp_id")
    @JsonBackReference

    private  Employee employee;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getIfsccode() {
        return ifsccode;
    }

    public void setIfsccode(String ifsccode) {
        this.ifsccode = ifsccode;
    }
}
