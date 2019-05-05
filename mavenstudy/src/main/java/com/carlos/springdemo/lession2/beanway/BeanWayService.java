package com.carlos.springdemo.lession2.beanway;

public class BeanWayService {
    public BeanWayService(){
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void init(){
        System.out.println("bean-init");
    }
    public void destroy(){
        System.out.println("bean-destory");
    }
}
