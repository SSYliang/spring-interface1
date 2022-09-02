package com.test.interfacetest.controller;

import com.test.interfacetest.bean.UserBeanFactoryPostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserBeanFactoryPostProcessorController {

    @Autowired
    private UserBeanFactoryPostProcessor user ;
    @RequestMapping("/user")
    public  String getUser(){
        return user.getUsername();
    }
}
