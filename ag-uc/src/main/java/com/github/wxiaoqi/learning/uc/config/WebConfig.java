package com.github.wxiaoqi.learning.uc.config;

import com.github.wxiaoqi.learning.common.handler.GlobalExceptionHandler;
import com.github.wxiaoqi.learning.uc.interceptor.ClientInterceptor;
import com.github.wxiaoqi.learning.uc.interceptor.ClientTokenInterceptor;
import com.github.wxiaoqi.learning.uc.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ace on 2017/9/8.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    GlobalExceptionHandler getGlobalExceptionHandler(){
        return new GlobalExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getClientInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(getJWTInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Bean
    JWTInterceptor getJWTInterceptor(){
        return new JWTInterceptor();
    }

    @Bean
    ClientInterceptor getClientInterceptor(){
        return new ClientInterceptor();
    }

    @Bean
    ClientTokenInterceptor getClientTokenInterceptor(){
        return new ClientTokenInterceptor();
    }
}
