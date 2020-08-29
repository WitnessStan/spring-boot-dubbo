package com.example.consumer.controller;

import com.server.client.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Reference
    private TestService testService;

    @GetMapping("/dubboTest")
    public String test() {
        return testService.test();
    }
}
