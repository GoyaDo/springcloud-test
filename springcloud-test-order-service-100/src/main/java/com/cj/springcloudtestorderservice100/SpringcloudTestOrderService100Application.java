package com.cj.springcloudtestorderservice100;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudTestOrderService100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTestOrderService100Application.class, args);
    }

}
