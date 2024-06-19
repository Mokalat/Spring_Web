package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application01 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("section01/xmlconfig/spring-config.xml");
        MemberDTO member =context.getBean(MemberDTO.class);
    }
}