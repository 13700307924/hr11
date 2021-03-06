package com.kgc.sun.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.kgc.sun.hr.mapper")
@SpringBootApplication
public class HrApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrApplication.class, args);
    }

}
