package com.lianfu.gasserversys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lianfu.gasserversys.mapper")
public class GasserversysApplication {

    public static void main(String[] args) {
        SpringApplication.run(GasserversysApplication.class, args);
    }

}
