//package com.app.use.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
//
//@Configuration
//@ComponentScan
//@PropertySource(value = {"classpath:application.properties"})
//public class AppConfig {
//
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//    	  PropertySourcesPlaceholderConfigurer config = new PropertySourcesPlaceholderConfigurer();
//    	  config.setIgnoreUnresolvablePlaceholders(true);
//    	  return config;
//    }
//}