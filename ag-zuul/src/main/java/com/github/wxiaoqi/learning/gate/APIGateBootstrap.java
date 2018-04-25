package com.github.wxiaoqi.learning.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

/**
 * Created by ace on 2017/9/6.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@ComponentScan("com.github.wxiaoqi.learning.gate")
@EnableFeignClients
public class APIGateBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(APIGateBootstrap.class,args);
    }
}
