package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DatawebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatawebApplication.class, args);
    }
}
