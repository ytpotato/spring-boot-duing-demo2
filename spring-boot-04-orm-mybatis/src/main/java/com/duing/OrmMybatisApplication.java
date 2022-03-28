package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.duing.mapper")
//@MapperScan(basePackages = "com.duing.tk.mapper")
public class OrmMybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(OrmMybatisApplication.class, args);
    }

}
