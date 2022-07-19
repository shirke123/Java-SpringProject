package com.example.Java10FebSpringpro.Task1.repository;

import com.example.Java10FebSpringpro.Task1.domain.Stud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepository extends JpaRepository<Stud,Integer> {
}
