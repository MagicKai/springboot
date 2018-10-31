package com.zkx.spingboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/kkk")
    public String testZkx(){
        return "测试方法";
    }

    @RequestMapping("/admin")
    public String testZkx1(){
        return "测试方拦截器1";
    }

    @RequestMapping("/admin/p")
    public String testZkx2(){
        return "测试方拦截器2";
    }

    @RequestMapping("/admin/k/h")
    public String testZkx3(){
        return "测试方拦截器3";
    }
}
