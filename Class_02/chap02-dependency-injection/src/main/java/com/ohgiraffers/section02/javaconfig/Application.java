package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Application {
    @Bean(name = "accout")
    public Account account() {}
}
