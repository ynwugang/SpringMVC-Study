package com.wugang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author wugang
 * @date 2022/4/25 10:58
 */
@Controller
public class RestFulController {

    /**
     * 原有的请求方式
     * http://localhost:8080/add?a=3&b=5
     *
     * @param a
     * @param b
     * @param model
     * @return
     */
    @RequestMapping("/add")
    public String test(int a, int b, Model model){
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }

    /**
     * RestFul 风格
     * http://localhost:8080/restful/3/5
     *
     * @param a
     * @param b
     * @param model
     * @return
     */
    @RequestMapping("/restful/{a}/{b}")
    public String testRestFul(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }

    /**
     * RestFul 注解变体
     * @GetMapping
     * @PostMapping
     * @PutMapping
     * @DeleteMapping
     * @PatchMapping
     * @param a
     * @param b
     * @param model
     * @return
     */
//    @RequestMapping(value="restful/{a}/{b}", method = RequestMethod.GET)
    @PostMapping("/restful/{a}/{b}")
    public String testRestFul1(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }
}
