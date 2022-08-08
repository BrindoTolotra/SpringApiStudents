package com.example.heispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.heispring","controller"}) //scanner ses packages s'il y a un controller
public class HeiSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeiSpringApplication.class, args);
    }

}
