package com.example.spring.chapter3.section4;

import com.example.spring.chapter3.section4.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.close();
    }
     /*
        懒加载
    *       spring ioc容器初始化时就执行了实例化和依赖注入
    *       懒加载之后：@ComponentScan (basePackages="com.example.springboot", lazyinit = true) ---- Spring 并不会在发布Bean定义后马上为我们完成实例化和依赖注入。
        @PostConstruct
            定义初始化方法
        @PreDestroy
            定义销毁方法
        BeanPostProcessor:Bean的后置处理器，对所有的bean有效
    * */
}
