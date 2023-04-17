package com.example.prog3back;

import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1{
    public ConcreteClass2(ConcreteDependance1 dependance1, ConcreteDependance2 dependance2) {
        super(dependance1, dependance2);
    }

    @Override
    public void something() {}
}
