package com.carlos.springdemo.lession1.javaconfig;

public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.SayHello(word);
    }
}
