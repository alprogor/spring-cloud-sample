package com.example.study;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 启用Eureka Client
public class MessageService8001 {
    public static void main(String[] args) {
        SpringApplication.run(MessageService8001.class,args);
    }
}
