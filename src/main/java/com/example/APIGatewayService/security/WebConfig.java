package com.example.APIGatewayService.security;

import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

    //Napisana cela klasa, nije je bilo. Povucen WEBMVCDependensi, nije ga bilo

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:4200");
        registry.addMapping("/**").allowedOrigins("http://localhost:8083");
        registry.addMapping("/**").allowedOrigins("https://localhost:8443");
        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
