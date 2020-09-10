package com.example.spring.chapter3.section5;

import com.example.spring.chapter3.section5.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

/*@PropertySource(value={"classpath:jdbc.properties"},ignoreResourceNotFound=true)*/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.close();
    }
    /*
    * 1.属性文件依赖（有此依赖之后，application才可以为你工作）
    *       <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-configuration-processor</artifactId>
                <optional>true</optional>
		    </dependency>
	   2.读取yml
	        ① 在yml中配置属性
	        ② 在DataBaseProperties使用属性配置 读取属性 @Value 或者 @ConfigurationProperties
	        ③ 可以把数据库配置移动到jdbc.properties中 ，启动类： @PropertySource(value={"classpath:jclbc.properties"｝ ，ignoreResourceNotFound=true) 也同样可以从jdbc.properties中读取属性
    * */

}
