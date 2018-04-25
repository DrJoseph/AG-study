package com.github.wxiaoqi.learning.common.exception.auth;

import com.github.wxiaoqi.learning.common.constants.CommonConstants;
import com.github.wxiaoqi.learning.common.exception.BaseException;

/**
 * Created by ace on 2017/9/8.
 */
public class TokenErrorException extends BaseException {
    public TokenErrorException(String message, int status) {
        super(message, CommonConstants.EX_TOKEN_ERROR_CODE);
    }
}
