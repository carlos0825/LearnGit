package com.carlos.springdemo.lession1.di;
import org.springframework.stereotype.Service;
//功能bean
@Service
public class FunctionService {

    public String SayHello(String word){
        return "Hello"+word;
    }
}
