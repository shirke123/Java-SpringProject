package com.example.Java10FebSpringpro.Task1.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Setter
@Getter
public class Stud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer id;
    private  String name;
    private  String address;
    private  double percentages;



}
