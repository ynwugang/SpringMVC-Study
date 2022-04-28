package com.wugang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wugang
 * @date 2022/4/28 11:35
 */
@RestController
public class TestController {
    @GetMapping("/test123")
    public String test() {
        System.out.println("TestController==> test()执行了");
        return "OK";
    }

    @RequestMapping("/t1")
    public String test12(){
        return "hello";
    }
}
