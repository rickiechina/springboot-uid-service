package com.rickie.ordercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@MapperScan({"com.baidu.fsg.uid.worker.dao"})
public class UidConsumerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(UidConsumerApp.class, args);
    }
}
