package com.zkx.spingboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/kkk")
    public String testZkx(){
        return "测试方法";
    }
}
