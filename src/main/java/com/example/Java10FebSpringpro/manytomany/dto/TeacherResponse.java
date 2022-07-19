package com.example.Java10FebSpringpro.manytomany.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"id","name","address"})
public interface TeacherResponse {

    @JsonProperty("Id")
    Integer getId();

    String getName();

    String getAddress();
}






/**
 sequence data
 Capital letter changes karu shakto

 xml,json data postman and swagger procedure

 */

