package com.kzx.lmall.lmalluser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.kzx.lmall.lmalluser.mapper")
public class LmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmallUserApplication.class, args);
    }

}
