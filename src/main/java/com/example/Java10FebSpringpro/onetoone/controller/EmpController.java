package com.example.Java10FebSpringpro.onetoone.controller;

import com.example.Java10FebSpringpro.onetoone.domain.Employee;
import com.example.Java10FebSpringpro.onetoone.repository.EmpolyeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    private EmpolyeeRepository empolyeeRepository;


    @PostMapping("saveEmp")
    public String saveEmp(@RequestBody Employee employee){
        empolyeeRepository.save(employee);
        return "saved Employee....";
    }
}


 /**"name":"rahul",
         "address":"pune",
         "salaryAccount":{
         "accountNumber":"2054055849",
         "ifsccode":"233445"
         }
         }
*/