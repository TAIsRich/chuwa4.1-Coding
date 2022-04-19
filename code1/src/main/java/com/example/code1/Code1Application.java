package com.example.code1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.code1.repository")
public class Code1Application {
    public static void main(String[] args) {
        SpringApplication.run(Code1Application.class, args);
    }
}
