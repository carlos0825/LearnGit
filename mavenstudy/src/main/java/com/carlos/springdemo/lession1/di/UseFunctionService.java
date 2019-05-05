package com.carlos.springdemo.lession1.di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//功能bean
@Service
public class UseFunctionService {

    @Autowired //
            FunctionService functionService;

    public String SayHello(String word){
        return functionService.SayHello(word);
    }

}
