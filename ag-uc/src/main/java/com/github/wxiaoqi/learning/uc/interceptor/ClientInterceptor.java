package com.github.wxiaoqi.learning.uc.interceptor;

import com.github.wxiaoqi.learning.common.exception.auth.ClientForbiddenException;
import com.github.wxiaoqi.learning.common.util.jwt.IJWTInfo;
import com.github.wxiaoqi.learning.common.vo.BaseResponse;
import com.github.wxiaoqi.learning.common.vo.ObjectRestResponse;
import com.github.wxiaoqi.learning.uc.jwt.ClientTokenUtil;
import com.github.wxiaoqi.learning.uc.rpc.ClientAuthRpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ace on 2017/9/12.
 */
@SuppressWarnings("ALL")
@Configuration
public class ClientInterceptor extends HandlerInterceptorAdapter {
    private Logger logger = LoggerFactory.getLogger(ClientInterceptor.class);
    @Value("${client.token-header}")
    private String tokenHeader;

    @Autowired
    private ClientTokenUtil clientTokenUtil;

    @Autowired
    private ClientAuthRpc clientAuthRpc;

    @Value("${client.id}")
    private String clientId;
    @Value("${client.secret}")
    private String clientSecret;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("client interceptor....");
        String token = request.getHeader(tokenHeader);
        IJWTInfo infoFromToken = clientTokenUtil.getInfoFromToken(token);
        String uniqueName = infoFromToken.getUniqueName(); // clientName（code）

        BaseResponse resp = clientAuthRpc.getAllowedClient(clientId, clientSecret);
        if(resp.getStatus() == 200){
            ObjectRestResponse<List<String>> allowedClient = (ObjectRestResponse<List<String>>) resp;
            for(String client:allowedClient.getData()){
                if(client.equals(uniqueName)){
                    return super.preHandle(request, response, handler);
                }
            }
        }
        throw new ClientForbiddenException("Client is Forbidden!");
    }
}
