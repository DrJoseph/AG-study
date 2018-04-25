package com.github.wxiaoqi.learning.uc.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ace on 2017/9/12.
 */
public class ClientTokenInterceptor  implements RequestInterceptor {
    private Logger logger = LoggerFactory.getLogger(ClientTokenInterceptor.class);
    @Override
    public void apply(RequestTemplate requestTemplate) {
        logger.info("发起feign client 请求前申请token！");
        requestTemplate.header("client-token","token");
    }
}
