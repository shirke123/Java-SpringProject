package com.example.Java10FebSpringpro.manytomany.controller;

import com.example.Java10FebSpringpro.manytomany.domain.Teacher;

public class Response <T>{

    private  String message;
    private Teacher result;
    private  String statusCode;



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Teacher getResult() {
        return result;
    }

    public void setResult(Teacher result) {
        this.result = result;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
