package com.example.Java10FebSpringpro.project.repository;

import com.example.Java10FebSpringpro.project.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{


}
