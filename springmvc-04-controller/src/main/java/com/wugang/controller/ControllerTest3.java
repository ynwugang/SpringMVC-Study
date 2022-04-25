package com.wugang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wugang
 * @date 2022/4/25 10:44
 */
@Controller
@RequestMapping("/test3")
public class ControllerTest3 {

    @RequestMapping("t1")
    public String test(Model model){
        model.addAttribute("msg", "test3");
        return "test";
    }
}
