package com.andy.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.andy.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.andy.member.feign")
public class GlMemberApplication {
    // 39c69e0870f74c53
    public static void main(String[] args) {
        SpringApplication.run(GlMemberApplication.class, args);
    }

}
