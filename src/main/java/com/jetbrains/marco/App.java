package com.jetbrains.marco;

import com.jetbrains.marco.config.ProjectConfig;
import com.jetbrains.marco.model.Parrot;
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
        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());

        Parrot x = new Parrot();
        x.setName("Koko");
        Supplier<Parrot> parrotSupplier = () -> x;

        context.registerBean("parrot4",
                Parrot.class, parrotSupplier);

        Parrot p4 = context.getBean("parrot4",Parrot.class);
        System.out.println(p4.getName());
//        String s = context.getBean(String.class);
//        System.out.println(s);
//        Integer n = context.getBean(Integer.class);
//        System.out.println(n);
    }
}
