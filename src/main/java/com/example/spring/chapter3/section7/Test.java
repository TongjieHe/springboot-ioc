package com.example.spring.chapter3.section7;

import com.example.spring.chapter3.section7.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.close();
    }

/*
*
* */
}
