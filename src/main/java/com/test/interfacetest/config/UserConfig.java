package com.test.interfacetest.config;

import com.test.interfacetest.bean.UserBeanPostProcessor;
import com.test.interfacetest.processor.UserPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean(initMethod = "initUserBeanPostProcessor",destroyMethod = "destroyUserBeanPostProcessor")
    public UserBeanPostProcessor user() {
        return new UserBeanPostProcessor();
    }

    @Bean
    public UserPostProcessor userPostProcessor() {
        return new UserPostProcessor();
    }
}

