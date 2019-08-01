package com.cqlyy.life;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 */
@SpringBootApplication
@MapperScan("com.cqlyy.life.mapper")
public class MyLifeCommunityApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyLifeCommunityApplication.class,args);
    }
}
