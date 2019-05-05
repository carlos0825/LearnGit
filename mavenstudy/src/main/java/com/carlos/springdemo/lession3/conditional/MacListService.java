package com.carlos.springdemo.lession3.conditional;

public class MacListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
