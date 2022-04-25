package com.wugang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wugang.pojo.User;
import com.wugang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wugang
 * @date 2022/4/25 16:26
 */
//@Controller
@RestController
public class UserController {
    @RequestMapping("/j1")
    //@ResponseBody //不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson；objectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        //创建一个对象
        User user = new User("张三", 8, "男");

//        String str = objectMapper.writeValueAsString(user);
//        return str;
        return JsonUtils.getJson(user);
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i <= 4; i++){
            userList.add(new User("张" + i, i, "男"));
        }

//        return new ObjectMapper().writeValueAsString(userList);
        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//
//        //不使用时间戳的方式
//        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        //自定义日期格式对象
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        //指定日期格式
//        mapper.setDateFormat(sdf);
//
//        Date date = new Date();
//
//        //ObjectMapper：时间解析后的默认格式为：Timestamp,时间戳
//        return mapper.writeValueAsString(date);

        return JsonUtils.getJson(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    public String json4(){
        List<User> userList = new ArrayList<User>();
        for (int i = 0; i <= 4; i++){
            userList.add(new User("fastjson" + i, i, "男"));
        }

        return JSON.toJSONString(userList);
    }
}
