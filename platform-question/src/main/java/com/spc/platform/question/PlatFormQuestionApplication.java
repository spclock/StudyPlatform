package com.spc.platform.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.spc.platform.question.dao")
@SpringBootApplication
public class PlatFormQuestionApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatFormQuestionApplication.class, args);
    }
}