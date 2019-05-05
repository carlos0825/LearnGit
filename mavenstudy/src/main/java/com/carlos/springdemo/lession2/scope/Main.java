package com.carlos.springdemo.lession2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService demoPrototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService2 = context.getBean(DemoPrototypeService.class);

        DemoSingletonService demoSingletonService1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService2 = context.getBean(DemoSingletonService.class);



        System.out.println("DemoPrototypeService Equals " + demoPrototypeService1.equals(demoPrototypeService2));

        System.out.println("DemoSingletonService Equals " + demoSingletonService1.equals(demoSingletonService2));

        context.close();
    }
}
