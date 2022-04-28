package com.wugang.controller;

import com.wugang.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wugang
 * @date 2022/4/27 18:57
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:name=>" + name);
        if ("zhangs".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    @ResponseBody
    public List<User> a2() {
        List<User> userList = new ArrayList<>();

        //添加数据
        userList.add(new User("张三", 2, "男"));
        userList.add(new User("李四", 3, "女"));
        userList.add(new User("王五", 4, "男"));

        return userList;
    }

    @RequestMapping("/a3")
    public Map<String, String> a3(String name, String pwd) {
        Map<String, String> map = new HashMap<>();
        if (name != null) {
            if ("admin".equals(name)) {
                map.put("userName", "ok");
            } else {
                map.put("userName", "用户名有误");
            }
        }

        if (pwd != null) {
            if ("123456".equals(pwd)) {
                map.put("pwd", "ok");
            } else {
                map.put("pwd", "密码有误");
            }
        }

        return map;
    }
}
