package com.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.controller")


/*
 * 
 * to configure a web application, we could make use of the WebMvcConfigurerAdapter class
 * This is an abstract class that implements the WebMvcConfigurer interface and contains empty implementations for all the methods inherited.
 * 
 * WebMvcConfigurerAdapter - deprecated
 * This warning will appear if we're using Spring version 5 (or Spring Boot 2)
 * Solution:
 * public WebConfig implements WebMvcConfigurer
 */
public class WebConfig implements WebMvcConfigurer{

}
