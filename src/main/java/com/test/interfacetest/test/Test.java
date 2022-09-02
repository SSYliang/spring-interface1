package com.test.interfacetest.test;

import com.test.interfacetest.config.UserConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfig.class);
        ((AnnotationConfigApplicationContext) applicationContext).close();
    }
}