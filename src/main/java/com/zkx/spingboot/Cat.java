package com.zkx.spingboot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {

    @PostConstruct
    public void initial(){
        System.out.println("cat-init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("cat-destroy");
    }
}
