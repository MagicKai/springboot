package com.zkx.springboot;


import com.zkx.springboot.controller.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest(classes = WebApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class TestControllerTest {
    @Autowired
    private HomeController homeController;

    @Test
    public void testZx() {
        System.out.println(homeController.hello());
    }
}
