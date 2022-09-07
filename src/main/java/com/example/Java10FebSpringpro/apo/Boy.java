package com.example.Java10FebSpringpro.AOP;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public int   studyMaths(int i){
        System.out.println("boys is studying");
        return 100;
    }

    public  Exception myException()throws Exception{
        throw  new Exception("throwing Exception");
    }
}
