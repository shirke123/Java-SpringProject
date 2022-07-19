package com.example.Java10FebSpringpro.onetomany.controller;

import com.example.Java10FebSpringpro.onetomany.domain.Vehicle;
import com.example.Java10FebSpringpro.onetomany.repository.VehicleRepository;
//import com.example.Java10FebSpringpro.onetomany.service.VehicleService;
import com.example.Java10FebSpringpro.onetomany.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class VehicleController {

//    @Autowired
//    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleService vehicleService;

    @PostMapping(name = "saveVehicle")
    public String saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);

    }
}

/**
{
        "name":"TVS",
        "color":"white",
        "Parts":[
        {
        "name":"light",
        "number":"9077"
        },
        {
        "name":"seat",
        "number":"9623"
        }
        ]
        }
*/