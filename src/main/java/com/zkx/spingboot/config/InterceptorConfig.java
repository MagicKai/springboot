package com.zkx.spingboot.config;

import com.zkx.spingboot.interceptor.TestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private TestInterceptor testInterceptor;

    private static List<String> pathList = new ArrayList<>();

    static{
        pathList.add("/admin/**");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testInterceptor).addPathPatterns(pathList);
    }
}
