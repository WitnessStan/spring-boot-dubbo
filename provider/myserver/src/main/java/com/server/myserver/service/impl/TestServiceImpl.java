package com.server.myserver.service.impl;


import com.server.client.service.TestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "hello dubbo";
    }
}
