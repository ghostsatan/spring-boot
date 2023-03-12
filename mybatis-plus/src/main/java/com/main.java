package com;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mapper")
@SpringBootApplication()
public class main {

    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
        System.out.println("启动成功");
    }

}
