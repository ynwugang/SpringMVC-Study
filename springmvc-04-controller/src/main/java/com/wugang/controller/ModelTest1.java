package com.wugang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wugang
 * @date 2022/4/25 14:24
 */
@Controller
public class ModelTest1 {
    /**
     * 在controller中可以使用servlet原生的转发和重定向（此时不需要视图解析器）
     *
     *
     * @param model
     * @return
     */
    @GetMapping("/m1/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "ModelTest1");

        //使用servlet原生的转发和重定向，不需要springmvc的视图解析器
        //转发
        //return "/WEB-INF/jsp/test.jsp";
        //return "forward:/WEB-INF/jsp/test.jsp";
        //重定向
        //return "redirect:/index.jsp";

        //使用视图解析器
        //转发：直接return jsp名称
        //return "test";
        //重定向：地址前加redirect:关键字
        return "redirect:/index.jsp";
    }
}
