package com.tekin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tekin.omer on 12/10/2014.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class TApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(TApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TApplication.class);
    }
}
