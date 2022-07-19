package com.example.Java10FebSpringpro.manytomany.repository;

import com.example.Java10FebSpringpro.manytomany.domain.Subjects;
import com.example.Java10FebSpringpro.manytomany.domain.Teacher;
import com.example.Java10FebSpringpro.manytomany.dto.TeacherResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

    @Query(value = "call getTeacherData()", nativeQuery = true)
    List<TeacherResponse> getTeacherData();
}