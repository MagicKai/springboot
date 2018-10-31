package com.zkx.spingboot.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TestInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String qqq = request.getParameter("qqq");
        if("123".equals(qqq)){
            return true;
        }
        response.getWriter().print("AccessToken ERROR");
        return false;
    }
}
