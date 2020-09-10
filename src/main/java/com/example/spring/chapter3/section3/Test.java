package com.example.spring.chapter3.section3;

import com.example.spring.chapter3.section3.config.AppConfig;
import com.example.spring.chapter3.section3.pojo.BussinessPerson;
import com.example.spring.chapter3.section3.pojo.definition.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class);
        Person person= ctx.getBean(BussinessPerson.class);
        person.service();
    }
    /*
        @Autowired
            1.首先它会根据类型找到对应的Bean
            2.如果对应类型的 Bean 不是唯一的，那么它会根据其属性名称和 Bean 的名称进行匹配。如果匹配得上，就会使用该 Bean ：如果还无法匹配，就会抛出异常。
            3.默认必须找到对应 Bean 的注解，@Autowired(required = false )：可以允许值为null
            4.Autowired可以作用于方法
    * */
    // ---------------------------------------------------------------------------------------
    /*
        @Primary
            1.修改优先权的注解：Autowired找到多个Bean时，Bean上有@Primary的优先注入
    * */
    // ---------------------------------------------------------------------------------------
    /*
        @Quelifier("Dog")
            1.通过名称来查找对应的bean
    * */
   // ---------------------------------------------------------------------------------------
    /*
        带有参数的构造方法
        public BussinessPerson(@Autowired @Qualifier("dog") Animal animal){
            this.animal=animal;
        }
    */
}
