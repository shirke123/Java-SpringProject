package com.example.Java10FebSpringpro.project.repository;

import com.example.Java10FebSpringpro.project.model.PrefixGenderMapping;
import com.example.Java10FebSpringpro.project.model.PrefixGenderMappingId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixGenderMappingRepo extends JpaRepository<PrefixGenderMapping,Object> {
}
