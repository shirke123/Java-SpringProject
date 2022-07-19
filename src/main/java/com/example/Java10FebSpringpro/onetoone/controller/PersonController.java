package com.example.Java10FebSpringpro.onetoone.controller;

import com.example.Java10FebSpringpro.onetoone.domain.Aadhar;
import com.example.Java10FebSpringpro.onetoone.domain.Person;
import com.example.Java10FebSpringpro.onetoone.repository.AadharRepository;
import com.example.Java10FebSpringpro.onetoone.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AadharRepository aadharRepository;


    @PostMapping("savePerson")
    public String savePerson() {
        Person person = new Person();

        person.setName("Prakash");
        person.setAddress("Pune");

        Aadhar aadhar = new Aadhar();
        aadhar.setNumber(4563423457L);
        aadhar.setPerson(person);

        person.setAadhar(aadhar);

        personRepository.save(person);
        aadharRepository.save(aadhar);

        return "saved person";

    }
}