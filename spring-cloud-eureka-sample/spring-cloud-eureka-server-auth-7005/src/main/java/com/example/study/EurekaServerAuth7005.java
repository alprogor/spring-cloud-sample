package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAuth7005 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerAuth7005.class,args);
    }
}
