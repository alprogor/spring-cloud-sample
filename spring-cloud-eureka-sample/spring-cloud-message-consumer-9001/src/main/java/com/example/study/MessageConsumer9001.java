package com.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient // 开启Eureka Client，消费者通过Eureka Client来从Eureka Server拉取服务列表
public class MessageConsumer9001 {
    public static void main(String[] args) {
        SpringApplication.run(MessageConsumer9001.class,args);
    }
    // 创建一个Bean,用于发起http请求，spring boot微服务使用http调用
    @Bean
    @LoadBalanced // eureka与这个配合，要使用LoadBalanced才会调用eureka中注册的服务
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
