package com.zkx.spingboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

    @Bean
    public CarFactory createCarFactory(){
        return new CarFactory();
    }

    @Bean(name="zkx")
    @Scope("prototype")
    public MyBean createMyBean(){
        return new MyBean();
    }

    @Bean
    public JeepFactoryBean createJeepFactory(){
        return new JeepFactoryBean();
    }

    @Bean
    public Car createCar(CarFactory carFactory){
        return carFactory.create();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog createDog(){
        return new Dog();
    }

    @Bean
    public Cat createCat(){
        return new Cat();
    }
}
