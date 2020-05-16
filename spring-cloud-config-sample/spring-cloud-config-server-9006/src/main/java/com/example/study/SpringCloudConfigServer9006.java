package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServer9006 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer9006.class, args);
    }
}
