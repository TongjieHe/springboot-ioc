package com.example.spring.chapter3.section4.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Bean的后置处理器
 */
@Component
public class BeanPostProcessorExample implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean , String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用postProcessBeforeinitialization 方法，参数 :"+bean.getClass().getSimpleName()+"--"+beanName);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean , String beanName) throws BeansException {
        System.out.println("BeanP ostProcessor 调用postProcessBeforeinitialization 方法，参数 "+bean.getClass().getSimpleName()+"--"+beanName);
        return bean;
    }


}
