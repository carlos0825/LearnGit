package com.carlos.springdemo.lession1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.carlos.springdemo.lession1.aop.Action)")
    public void annotationPointCut(){};

    //@After("annotationPointCut()")
    //public void after(JoinPoint joinpoint){
    //    MethodSignature signature= (MethodSignature) joinpoint.getSignature();
    //    Method method=signature.getMethod();
    //    Action action=method.getAnnotation(Action.class);
    //    System.out.println("注解拦截"+action.name());
    //}

    @After("execution(* com.carlos.springdemo.lession1.aop.DemoMethodService.*(..))")
    public void after(JoinPoint joinpoint){
        MethodSignature signature= (MethodSignature) joinpoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方式结束拦截" + method.getName());
    }

    @Before("execution(* com.carlos.springdemo.lession1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinpoint){
        MethodSignature signature= (MethodSignature) joinpoint.getSignature();
        Method method=signature.getMethod();
        System.out.println("方式开始拦截" + method.getName());
    }


}
