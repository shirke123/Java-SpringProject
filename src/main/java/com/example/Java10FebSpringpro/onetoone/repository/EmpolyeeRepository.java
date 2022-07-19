package com.example.Java10FebSpringpro.onetoone.repository;

import com.example.Java10FebSpringpro.onetoone.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpolyeeRepository extends JpaRepository<Employee,Integer> {
}
