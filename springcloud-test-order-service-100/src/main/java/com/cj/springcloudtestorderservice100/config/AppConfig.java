package com.cj.springcloudtestorderservice100.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author cj
 * @date 2019-11-05 - 22:17
 * 配置Tomcat启动端口
 */
@Configuration
public class AppConfig {
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(){
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(1000);
        return factory;
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
