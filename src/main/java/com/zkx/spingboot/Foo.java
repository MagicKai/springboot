package com.zkx.spingboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Foo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println(context.getBean(MyConfig.class));
        System.out.println(context.getBean("zkx"));
        System.out.println(context.getBean(JeepFactoryBean.class));
        System.out.println(context.getBean("&createJeepFactory"));
        System.out.println(context.getBean("createJeepFactory"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println("==============asdjlisadlo===============");
        context.close();
    }
}
