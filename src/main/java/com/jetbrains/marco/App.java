package com.jetbrains.marco;

import com.jetbrains.marco.config.ProjectConfig;
import com.jetbrains.marco.model.Parrot;
import com.jetbrains.marco.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());

    }
}
