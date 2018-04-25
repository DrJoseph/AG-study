package com.github.wxiaoqi.learning.auth.service.impl;

import com.github.wxiaoqi.learning.auth.bean.UserInfo;
import com.github.wxiaoqi.learning.auth.service.UserService;
import com.github.wxiaoqi.learning.common.exception.auth.UserInvalidException;
import org.springframework.stereotype.Service;

/**
 * Created by ace on 2017/9/10.
 */
@Service
public class LocalUserService implements UserService {
    @Override
    public UserInfo login(String username, String password) {
        // 此处可以变为从user-center 获取
        UserInfo localInfo = new UserInfo(username, "管理员", "1", "123456");
        if (!localInfo.getPassword().equals(password)) {
            throw new UserInvalidException("User Password Error!");
        }
        return localInfo;
    }
}
