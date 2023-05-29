package com.merkator.merkatorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MerkatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerkatorApplication.class, args);
        System.out.println("Application Running");
    }

}
