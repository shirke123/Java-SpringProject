package com.example.Java10FebSpringpro.onetomany.repository;

import com.example.Java10FebSpringpro.onetomany.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {

}
