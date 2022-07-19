package com.example.Java10FebSpringpro.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JdbcExample {

    @Autowired

    private JdbcTemplate jdbcTemplate;

    @GetMapping("getVehicleById")
    public List<VehicleDto> getVehicle() {
        return jdbcTemplate.query("select v.id,v.name,v.color,p.number,p.name as partName from  Vehicle v"
                + "inner join parts p on p.vehicle_id = " +
                "v.id", new Object[]{}, new VehicleRowMapper());

    }
}
//    public String getvehicle(@RequestParam Integer id){
//        return  jdbcTemplate.queryForObject("select name from Vehicle where id =?",new Object[]{id },String.class);








