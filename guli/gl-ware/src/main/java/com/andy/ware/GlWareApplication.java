package com.andy.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.andy.ware.dao")
@EnableDiscoveryClient
public class GlWareApplication {
    // 99f49525feafee22
    public static void main(String[] args) {
        SpringApplication.run(GlWareApplication.class, args);
    }

}
