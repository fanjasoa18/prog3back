package com.example.prog3back;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
    protected ConcreteDependance1 dependance1;
    protected ConcreteDependance2 dependance2;

    public abstract void something();
}
