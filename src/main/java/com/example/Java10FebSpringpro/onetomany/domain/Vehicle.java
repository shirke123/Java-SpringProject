package com.example.Java10FebSpringpro.onetomany.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer id;
    private  String name;
    private  String color;

    @OneToMany(mappedBy = "vehicle",cascade ={CascadeType.PERSIST,CascadeType.REMOVE},fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Parts> parts;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Parts> getParts() {
        return parts;
    }

    public void setParts(List<Parts> parts) {
        this.parts = parts;
    }
}
