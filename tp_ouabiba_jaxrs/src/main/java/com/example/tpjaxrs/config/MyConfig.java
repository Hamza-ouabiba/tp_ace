package com.example.tpjaxrs.config;


import com.example.tpjaxrs.controllers.CompteRestApp;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig()
    {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestApp.class);
        return jerseyServlet;
    }
}
