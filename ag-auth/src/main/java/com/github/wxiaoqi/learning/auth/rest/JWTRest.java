package com.github.wxiaoqi.learning.auth.rest;

import com.github.wxiaoqi.learning.auth.bean.UserInfo;
import com.github.wxiaoqi.learning.auth.service.UserService;
import com.github.wxiaoqi.learning.auth.util.JWTTokenUtil;
import com.github.wxiaoqi.learning.common.vo.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ace on 2017/9/10.
 */
@RestController
@RequestMapping("jwt")
public class JWTRest {
    @Autowired
    private JWTTokenUtil jwtUtil;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ObjectRestResponse authorize(String username, String password) throws Exception {
        UserInfo info = userService.login(username, password);
        return new ObjectRestResponse<String>().data(jwtUtil.generateToken(info));
    }
}
