package com.github.wxiaoqi.learning.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ace on 2017/9/6.
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.github.wxiaoqi.learning.uc.mapper")
@ComponentScan("com.github.wxiaoqi.learning.uc")
@EnableTransactionManagement
@EnableFeignClients
public class UseCenterBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UseCenterBootstrap.class,args);
    }
}