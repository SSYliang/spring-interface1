package com.test.interfacetest.bean;

import org.springframework.stereotype.Component;

@Component
public class UserBeanFactoryPostProcessor {
    private String username = "张三";
    public String getUsername() {
        return username;
    }
    public void setUsername(String userName) {
        this.username = userName;
    }
}

