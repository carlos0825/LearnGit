package com.carlos.springdemo.lession3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig  {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService() {
        return new WindowsListService();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService() {
        return new LinuxListService();
    }
    @Bean
    @Conditional(MacCondition.class)
    public ListService MacListSerivce() {
        return new MacListService();
    }
}
