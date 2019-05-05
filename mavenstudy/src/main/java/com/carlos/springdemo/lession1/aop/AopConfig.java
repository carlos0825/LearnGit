package com.carlos.springdemo.lession1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.carlos.springdemo.lession1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
