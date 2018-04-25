package com.github.wxiaoqi.learning.uc.rest;

import com.github.wxiaoqi.learning.common.context.BaseContextHandler;
import com.github.wxiaoqi.learning.common.rest.BaseController;
import com.github.wxiaoqi.learning.uc.biz.BaseUserBiz;
import com.github.wxiaoqi.learning.uc.entity.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ace on 2017/9/6.
 */
@RestController
@RequestMapping("user")
public class UserRest extends BaseController<BaseUserBiz,BaseUser>{

    @RequestMapping("/who")
    public String getCurrentUser(){
        return BaseContextHandler.getUsername();
    }
}
