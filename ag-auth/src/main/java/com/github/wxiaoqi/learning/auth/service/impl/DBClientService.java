package com.github.wxiaoqi.learning.auth.service.impl;

import com.github.wxiaoqi.learning.auth.bean.ClientInfo;
import com.github.wxiaoqi.learning.auth.entity.Client;
import com.github.wxiaoqi.learning.auth.mapper.ClientMapper;
import com.github.wxiaoqi.learning.auth.service.ClientService;
import com.github.wxiaoqi.learning.common.exception.auth.ClientInvalidException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ace on 2017/9/10.
 */
@Service
public class DBClientService implements ClientService {
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public ClientInfo apply(String clientId, String secret) {
        Client client = new Client();
        client.setCode(clientId);
        client = clientMapper.selectOne(client);
        if(client==null||!client.getSecret().equals(secret)){
            throw new ClientInvalidException("Client not foud or Client secret is error!");
        }
        return new ClientInfo(client.getCode(),client.getName(),client.getId().toString());
    }

    @Override
    public List<String> getAllowedClient(String clientId, String secret) {
        ClientInfo info = this.apply(clientId, secret);
        return clientMapper.selectAllowedClient(info.getId());
    }
}
