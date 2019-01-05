package com.springboot.multidatasources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
@MapperScan(value = "com.springboot.multidatasources.mapper")
public class MultiDatasourcesApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiDatasourcesApplication.class, args);
    }
}

