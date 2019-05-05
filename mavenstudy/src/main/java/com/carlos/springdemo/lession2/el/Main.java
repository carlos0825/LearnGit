package com.carlos.springdemo.lession2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);

        ResourceService resourceService= context.getBean(ResourceService.class);
        resourceService.outputResource();
        context.close();
    }
}
