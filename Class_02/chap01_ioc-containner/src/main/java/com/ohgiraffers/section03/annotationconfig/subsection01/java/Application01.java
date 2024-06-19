package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

public class Application01 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for(String name:beanNames){
            System.out.println("beanName : " + name)    ;
        }

    }
}
