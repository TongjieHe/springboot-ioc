package com.example.spring.chapter3.section3.pojo;

import com.example.spring.chapter3.section3.pojo.definition.Animal;
import com.example.spring.chapter3.section3.pojo.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BussinessPerson implements Person {

    private Animal animal;

    //带有参数的构造方法
    public BussinessPerson(@Autowired @Qualifier("dog") Animal animal){
        this.animal=animal;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal=animal;
    }

    /*@Override
    @Autowired
    public void setAnimal(Animal animal) {
        this.animal=animal;
    }*/
}
