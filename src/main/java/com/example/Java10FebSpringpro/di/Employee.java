package com.example.Java10FebSpringpro.di;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    int id;
    String name;

    public Employee(){
        System.out.println("in employee const");
    }

    public void show(){
        System.out.println("In show");
    }
}
