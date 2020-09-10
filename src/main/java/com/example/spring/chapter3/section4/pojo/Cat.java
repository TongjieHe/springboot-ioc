package com.example.spring.chapter3.section4.pojo;

import com.example.spring.chapter3.section4.pojo.definition.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫"+ Dog.class.getSimpleName()+"是抓老鼠的");
    }
}
