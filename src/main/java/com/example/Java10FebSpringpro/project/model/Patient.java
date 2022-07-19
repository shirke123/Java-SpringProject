package com.example.Java10FebSpringpro.project.model;


import lombok.Data;
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
@Data
public class Patient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

      private  Integer id;
      private String firstName;
      private String secondName;
      private String address;
      private LocalDate dob;
      private  String gender;
      private String mobileNo;
      private  String prefix;



}
