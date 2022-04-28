package com.wugang.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author wugang
 * @date 2022/4/28 16:25
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆页面也要放行
        if (request.getRequestURI().contains("login")){
            return true;
        }

        //放行：判断说明情况下登陆了
        HttpSession session = request.getSession();
        if (session.getAttribute("userLoginInfo") != null){
            return true;
        }

        //其他情况，阻止并且转发到登录页
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
