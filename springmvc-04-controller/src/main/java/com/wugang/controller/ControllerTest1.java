package com.wugang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 只要实现了Controller接口的类，说明这就是一个控制器
 * @author wugang
 * @date 2022/4/25 10:24
 */
public class ControllerTest1 implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("msg", "ControllerTest1");
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
