package com.example.Java10FebSpringpro.jdbctemplate;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VehicleRowMapper implements RowMapper<VehicleDto>{

    @Override
    public VehicleDto mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Vehicle vehicle = new Vehicle();
        VehicleDto vehicle = new VehicleDto();
        vehicle.setName(rs.getString("name"));
        vehicle.setColor(rs.getString("color"));
        vehicle.setNumber(rs.getString("number"));
        vehicle.setPartName(rs.getString("partName"));

        return vehicle;

    }
}
