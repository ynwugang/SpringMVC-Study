package com.wugang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wugang
 * @date 2022/4/25 9:50
 */
//@RestController//返回JSON，不经过视图解析器
@Controller
@RequestMapping("/hello")
public class HelloController {
    // localhost:8080/hello/h1
    @RequestMapping("/h1")
    public String hello(Model model) {
        //封装数据
        model.addAttribute("msg", "hello SpringMVC Annotation");

        //会被视图解析器处理
        return "hello";
    }
}
