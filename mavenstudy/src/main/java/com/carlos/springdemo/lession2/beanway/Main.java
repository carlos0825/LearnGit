package com.carlos.springdemo.lession2.beanway;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanWayConfig.class);
        //BeanWayConfig beanWayConfig= context.getBean(BeanWayConfig.class);
        //beanWayConfig.beanWayService();
        //beanWayConfig.jsr250WayService();
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
