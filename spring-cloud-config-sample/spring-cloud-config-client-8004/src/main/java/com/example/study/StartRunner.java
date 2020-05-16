package com.example.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartRunner implements ApplicationRunner {

    @Value("${user.name}")
    private String username;
    @Override
    public void run(ApplicationArguments args) {
        System.out.println(username);
    }
}