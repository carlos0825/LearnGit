package com.carlos.springdemo.lession2.beanway;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destory-method");
    }
}

