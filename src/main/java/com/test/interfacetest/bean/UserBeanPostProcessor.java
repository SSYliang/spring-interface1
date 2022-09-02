package com.test.interfacetest.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserBeanPostProcessor implements InitializingBean, DisposableBean {
    public UserBeanPostProcessor(){
        System.out.println("实例化User构造方法...");
    }

    public void initUserBeanPostProcessor(){
        System.out.println("User初始化方法initUser...");
    }

    public void destroyUserBeanPostProcessor(){
        System.out.println("User销毁方法destroyUser...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用实现DisposableBean的destroy方法....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用实现InitializingBean的afterPropertiesSet方法......");
    }
}
