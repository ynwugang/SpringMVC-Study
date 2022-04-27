package com.wugang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wugang
 * @date 2022/4/27 18:57
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:name=>"+name);
        if ("zhangs".equals(name)){
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }
}
