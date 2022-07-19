package com.example.Java10FebSpringpro.manytomany.repository;

import com.example.Java10FebSpringpro.manytomany.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {

}
