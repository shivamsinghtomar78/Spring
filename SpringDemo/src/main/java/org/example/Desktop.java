package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//("com2")
@Component
@Primary
@Scope("prototype")
class Desktop implements Computer {

    public  Desktop() {
        System.out.println("Desktop  Object Created");
    }
    @Override
    public void compile() {
        System.out.println("Compiling using Desktop");
    }
}