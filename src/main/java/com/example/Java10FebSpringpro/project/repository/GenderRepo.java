package com.example.Java10FebSpringpro.project.repository;

import com.example.Java10FebSpringpro.project.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Integer> {
}
