package com.kgc.sun.hr.config;

import com.kgc.sun.hr.service.UserService;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLoginInterCeptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user=request.getSession().getAttribute(UserService.LOGINUSER);
        if(user==null){
            String path="";
            if(!request.getContextPath().equals("")){
                path=request.getContextPath();
            }
            String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
            response.sendRedirect(basePath+"/toLogin");
            return false;
        }
        return true;
    }
}
