package com.jetbrains.marco.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Parrot {
   private String name;
//    @PostConstruct
//    public void init() {
//        this.name = "Kiki";
//    }
}
