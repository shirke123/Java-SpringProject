package com.example.Java10FebSpringpro.AOP;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

    //advice
    @Before("pointCut()")
    public  void warmup() {
        System.out.println("warmup");
    }
        @After("pointCut()")
        public  void sleep(){
            System.out.println("Sleep");
        }

      @Pointcut("execution(public * study*(..))")
      public  void pointCut(){

    }

    @AfterReturning(pointcut = "pointCut()",returning = "value")
    public  void AfterRet(int value){
        System.out.println("after returning "+ value);
    }

    @AfterThrowing(pointcut = "execution(public * myException(..))",throwing = "value")
    public  void  afterThrowing(Exception value){
        System.out.println("In aspect"+value);
    }
}
