package com.spc.platform.channel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.spc.platform.channel.dao")
@SpringBootApplication
public class PlatformChannelApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformChannelApplication.class, args);
    }

}
