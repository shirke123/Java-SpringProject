package com.example.Java10FebSpringpro.Task1.Controller;

import com.example.Java10FebSpringpro.Task1.domain.Stud;
import com.example.Java10FebSpringpro.Task1.repository.StudRepository;
import com.example.Java10FebSpringpro.jpa.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudController {

    @Autowired
    private StudRepository studRepository;


    @PostMapping("saveStud")
    public String saveStud(@RequestBody Stud stud) {
        studRepository.save(stud);
        return "save stud";
    }

    @GetMapping("getAllStud")
    public List<Stud> getAllRecord() {
        return studRepository.findAll();
    }



}






