package com.keemono;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PageCoreConfiguration extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PageCoreConfiguration.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PageCoreConfiguration.class);
    }
}
