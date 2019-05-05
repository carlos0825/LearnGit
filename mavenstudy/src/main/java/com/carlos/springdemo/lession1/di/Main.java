package com.carlos.springdemo.lession1.di;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] arg){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class); //1           
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class); //2                    
        System.out.println(useFunctionService.SayHello("i`m new code"));
        context.close();
    }
}
