package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstbloodEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstbloodEurekaServerApplication.class, args);
    }

}