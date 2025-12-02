package com.jetbrains.marco.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    private String name = "Ella";
    @Autowired
    private Parrot parrot;
}
