package com.example.Java10FebSpringpro.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SimConfig
{
    @Bean
    public Vodafone getVodafone(){
        return new Vodafone();
    }

    @Bean
    public Jio getJio(){
        return new Jio();
    }
}
