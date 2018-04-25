package com.github.wxiaoqi.learning.common.exception.auth;

import com.github.wxiaoqi.learning.common.constants.CommonConstants;
import com.github.wxiaoqi.learning.common.exception.BaseException;

/**
 * Created by ace on 2017/9/12.
 */
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }

}
