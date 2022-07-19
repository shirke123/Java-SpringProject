package com.example.Java10FebSpringpro.onetoone.repository;

import com.example.Java10FebSpringpro.onetoone.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
