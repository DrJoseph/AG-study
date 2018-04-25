package com.github.wxiaoqi.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by ace on 2017/9/5.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaBootstrap.class,args);
    }
}
