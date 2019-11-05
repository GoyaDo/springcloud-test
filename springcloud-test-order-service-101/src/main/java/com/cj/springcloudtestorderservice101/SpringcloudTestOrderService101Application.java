package com.cj.springcloudtestorderservice101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudTestOrderService101Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTestOrderService101Application.class, args);
    }

}
