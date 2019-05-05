package com.carlos.springdemo.lession1.javaconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] arg){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class); //1           
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2                    
        System.out.println(useFunctionService.SayHello(" java config"));
        context.close();
    }
}
