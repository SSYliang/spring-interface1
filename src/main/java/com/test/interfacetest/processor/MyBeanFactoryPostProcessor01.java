package com.test.interfacetest.processor;

import com.test.interfacetest.bean.UserBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor01 implements BeanFactoryPostProcessor, Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        UserBeanFactoryPostProcessor user = (UserBeanFactoryPostProcessor) beanFactory.getBean("user");
        System.out.println("MyBeanFactoryPostProcessor01  取得的userName =  "+user.getUsername());
        user.setUsername("李四");
        System.out.println("MyBeanFactoryPostProcessor01------> 将userName 设置成"+user.getUsername());


    }

    @Override
    public int getOrder() {
        return 1;
    }
}
