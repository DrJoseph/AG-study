package com.github.wxiaoqi.learning.auth.service;


import com.github.wxiaoqi.learning.auth.bean.UserInfo;

/**
 * Created by ace on 2017/9/10.
 */
public interface UserService {
    UserInfo login(String username, String password);
}
