package com.logisticsdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.logisticsdemo.dao")
public class LogisticsDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(LogisticsDemoApplication.class, args);
    }

}
