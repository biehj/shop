package com.andy.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.andy.product.dao")
@EnableDiscoveryClient
public class ProductApplication {
    public static void main(String[] args) {

        // 77e56558d66fb621
        SpringApplication.run(ProductApplication.class, args);
    }

}
