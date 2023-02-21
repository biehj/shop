package com.andy.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Andy
 * @date: 2023-02-19 13:49
 * @version: 1.0.0
 * @description:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication();
        SpringApplication.run(Application.class, args);
    }
}
