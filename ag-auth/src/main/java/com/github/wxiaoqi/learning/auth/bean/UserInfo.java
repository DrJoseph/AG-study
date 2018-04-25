package com.github.wxiaoqi.learning.auth.bean;

import com.github.wxiaoqi.learning.common.util.jwt.IJWTInfo;

/**
 * Created by ace on 2017/9/10.
 */
public class UserInfo  implements IJWTInfo {
    String username;
    String name;
    String userId;
    String password;
    String sex;
    int age;

    public UserInfo() {
    }

    public UserInfo(String username, String name, String userId, String password) {
        this.username = username;
        this.name = name;
        this.userId = userId;
        this.password = password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUniqueName() {
        return username;
    }

    @Override
    public String getId() {
        return userId;
    }

    @Override
    public String getName() {
        return name;
    }
}
