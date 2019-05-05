package com.carlos.springdemo.lession2.beanway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.carlos.springdemo.lession2.beanway")

public class BeanWayConfig {
    @Bean(initMethod="init" , destroyMethod="destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
