package com.andy.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Andy
 * @date: 2023-02-19 16:57
 * @version: 1.0.0
 * @description:
 */
@SpringBootApplication
@MapperScan("com.andy.coupon.dao")
@EnableDiscoveryClient
public class CouponApplication {
    // 10ba6a77a13b1bca
    public static void main(String[] args) {
        SpringApplication.run(CouponApplication.class, args);

    }

}
