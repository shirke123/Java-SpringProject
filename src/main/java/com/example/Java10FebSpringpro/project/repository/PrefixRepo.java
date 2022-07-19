package com.example.Java10FebSpringpro.project.repository;

import com.example.Java10FebSpringpro.project.model.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefixRepo extends JpaRepository<Prefix,Integer> {
}
