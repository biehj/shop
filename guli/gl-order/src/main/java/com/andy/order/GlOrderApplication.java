package com.andy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.andy.order.dao")
@EnableDiscoveryClient
public class GlOrderApplication {
    //32e2eb00a192420e
    public static void main(String[] args) {
        SpringApplication.run(GlOrderApplication.class, args);
    }

}
