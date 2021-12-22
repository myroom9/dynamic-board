package com.example.dynamicboardweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.example.dynamicboardcore")
@SpringBootApplication(scanBasePackages = "com.example.dynamicboardweb")
public class DynamicBoardWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicBoardWebApplication.class, args);
    }
}
