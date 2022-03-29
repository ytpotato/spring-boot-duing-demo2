package com.duing.health;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 自定义端点
 */
@Endpoint(id = "customEndpoint")
@Component
public class CustomEnpoint {

    @ReadOperation
    @ResponseBody
    public Map<String,String> customEndpoint(){
        Map<String,String> map = new HashMap<>();
        map.put("custom","hello endpoint");
        return map;
    }
}
