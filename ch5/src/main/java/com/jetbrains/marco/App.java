package com.jetbrains.marco;

import com.jetbrains.marco.config.ProjectConfig;
import com.jetbrains.marco.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
