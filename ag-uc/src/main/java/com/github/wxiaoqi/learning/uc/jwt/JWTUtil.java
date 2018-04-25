package com.github.wxiaoqi.learning.uc.jwt;

import com.github.wxiaoqi.learning.common.util.jwt.IJWTInfo;
import com.github.wxiaoqi.learning.common.util.jwt.JWTHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ace on 2017/9/10.
 */
@Component
public class JWTUtil {
    @Value("${jwt.pub-key.path}")
    private String pubKeyPath;

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token,pubKeyPath);
    }

}
