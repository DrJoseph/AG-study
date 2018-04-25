package com.github.wxiaoqi.learning.uc.rpc;

import com.github.wxiaoqi.learning.common.vo.ObjectRestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by ace on 2017/9/12.
 */
@FeignClient("ag-auth")
public interface ClientAuthRpc {
    @RequestMapping(value = "/client/myClient")
    public ObjectRestResponse<List<String>> getAllowedClient(@RequestParam("serviceId") String serviceId,@RequestParam("secret") String secret);
}
