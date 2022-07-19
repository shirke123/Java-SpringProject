package com.example.Java10FebSpringpro.onetomany.service;

import com.example.Java10FebSpringpro.onetomany.domain.Vehicle;
import com.example.Java10FebSpringpro.onetomany.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class VehicleImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @PostMapping("saveVehicle")
    public  String saveVehicle(Vehicle vehicle){
        if(vehicle.getName().equals("TVS")){
            return "tvs vehicle is not allowed";
        }
        vehicleRepository.save(vehicle);
        return "vehicle is saved";

    }


}
