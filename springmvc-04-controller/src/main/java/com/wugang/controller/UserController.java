package com.wugang.controller;

import com.wugang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wugang
 * @date 2022/4/25 14:37
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * 接收基本数据
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        //1.接收前端参数
        System.out.println("前端参数为：" + name);
        //2.将返回结果传递给前端
        model.addAttribute("msg", name);
        //3.视图跳转
        return "test";
    }

    /**
     * 前端接收的是一个对象
     * 1.接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
     * 2.假设传递的是一个对象（User），匹配（User）对象中的字段名；如果名字一致则OK，否则，匹配不到
     *
     * @param user
     * @return
     */
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
}
