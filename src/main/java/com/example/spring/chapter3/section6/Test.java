package com.example.spring.chapter3.section6;

import com.example.spring.chapter3.section6.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.close();
    }

/*
*   AppConfig的getDataSource
*   DatabaseConditional类
* */
}
