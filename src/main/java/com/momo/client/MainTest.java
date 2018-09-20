package com.momo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.momo.service.UserService;

public class MainTest {

    public static void main(final String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring/appContext.xml");
        UserService service = ctx.getBean(UserService.class);
        System.out.println(service.getlastnameByUsername("ok"));
    }
}
