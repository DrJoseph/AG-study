package com.github.wxiaoqi.learning.auth.mapper;

import com.github.wxiaoqi.learning.auth.entity.Client;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ClientMapper extends Mapper<Client> {
    @Select(" SELECT\n" +
            "        client.CODE\n" +
            "      FROM\n" +
            "          gate_client client\n" +
            "      INNER JOIN gate_client_service gcs ON gcs.client_id = client.id\n" +
            "    WHERE\n" +
            "        gcs.service_id = #{serviceId}")
    @ResultType(String.class)
    List<String> selectAllowedClient(String serviceId);
}