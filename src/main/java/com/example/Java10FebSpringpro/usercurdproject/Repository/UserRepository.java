package com.example.Java10FebSpringpro.controller.Repository;

import com.example.Java10FebSpringpro.controller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
