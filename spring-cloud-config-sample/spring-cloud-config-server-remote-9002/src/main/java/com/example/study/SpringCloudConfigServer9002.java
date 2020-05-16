package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer9002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer9002.class, args);
    }
}
