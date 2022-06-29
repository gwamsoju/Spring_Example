package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFilter {

    @Bean
    public FilterRegistrationBean filter1(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterEx1());
        return bean;
    }

    @Bean
    public FilterRegistrationBean filter2(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterEx2());
        return bean;
    }

    @Bean
    public FilterRegistrationBean filter3(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new FilterEx3());
        return bean;
    }
}
