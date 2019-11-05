package com.cj.springcloudtestuserservice200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudTestUserService200Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTestUserService200Application.class, args);
    }

}
