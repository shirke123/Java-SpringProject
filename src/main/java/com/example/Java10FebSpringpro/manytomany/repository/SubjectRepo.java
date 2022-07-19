package com.example.Java10FebSpringpro.manytomany.repository;

import com.example.Java10FebSpringpro.manytomany.domain.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subjects,Integer> {
}
