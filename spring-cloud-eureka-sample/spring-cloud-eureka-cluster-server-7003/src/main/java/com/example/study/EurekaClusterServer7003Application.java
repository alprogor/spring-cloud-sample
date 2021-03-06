package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //使用EnableEurekaServer来把当前服务端作为一个Eureka服务端
public class EurekaClusterServer7003Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClusterServer7003Application.class, args);
    }
}
