package com.github.wxiaoqi.learning.uc.biz;

import com.github.wxiaoqi.learning.common.biz.BaseBiz;
import com.github.wxiaoqi.learning.common.exception.BaseException;
import com.github.wxiaoqi.learning.uc.entity.BaseUser;
import com.github.wxiaoqi.learning.uc.mapper.BaseUserMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ace on 2017/9/7.
 */
@Service
@Transactional
public class BaseUserBiz extends BaseBiz<BaseUserMapper,BaseUser>{

    @Override
    public BaseUser selectById(Object id) {
        throw new BaseException("Test Global Exception!");
    }
}
