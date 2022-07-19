package com.example.Java10FebSpringpro.manytomany.repository;

import com.example.Java10FebSpringpro.manytomany.domain.Student1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student1Repo extends JpaRepository<Student1,Integer> {
}
