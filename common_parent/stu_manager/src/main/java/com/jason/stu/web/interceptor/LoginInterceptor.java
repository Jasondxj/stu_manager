package com.jason.stu.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //拦截
        //1.排除不需要拦截路径
        if(request.getRequestURI().endsWith("login.do")||request.getRequestURI().endsWith("toRegister.do")||request.getRequestURI().endsWith("register.do")){
            return true;//放行
        }
        //2.如果已经登录，也要放行
        if(request.getSession().getAttribute("user") != null){
            return true;
        }
        //3.进入到login页面
        request.getRequestDispatcher("/WEB-INF/Modules/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
