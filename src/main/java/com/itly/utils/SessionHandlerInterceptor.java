package com.itly.utils;

import com.itly.pojo.UserVo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionHandlerInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        UserVo flag = (UserVo) session.getAttribute("user");
        //如果是ajax请求响应头会有，x-requested-with；
        if (httpServletRequest.getHeader("x-requested-with") != null && httpServletRequest.getHeader("x-requested-with").equalsIgnoreCase("XMLHttpRequest")){
            //Profile profile = (Profile)session.getAttribute(UserController.PROFILE);
            //System.out.println("SessionHandlerInterceptor: "+profile);

            //判断session里是否有用户信息
            if (flag == null){
                httpServletResponse.setStatus(888);
                return false;
            }else{
                return true;
            }
        }else{
            if (flag == null){
                httpServletResponse.sendRedirect("/page/login-3.html");
                return false;
            }else{
                return true;
            }
        }
    }
}
