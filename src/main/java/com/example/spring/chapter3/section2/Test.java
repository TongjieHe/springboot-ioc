package com.example.spring.chapter3.section2;

import com.example.spring.chapter3.section2.config.AppConfig;
import com.example.spring.chapter3.section2.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        //测试是否能够获取到user类
        ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        User user= ctx.getBean(User.class);
        System.out.println(user.getName());

    }
}
 /*
    @ComponentScan配置项的使用  AppConfig作为配置类
        1.@ComponentScan("com.example.spring.springboot3.*")  扫描包
        2.@ComponentScan(basePackageClasses = {User.class} )  扫描类
        3.@ComponentScan(basePackages = "com.example.spring.springboot3.*", excludeFilters = {@Filter(classes = {Service . class})})  扫描包，@Service的类不被ioc扫描注入
*/