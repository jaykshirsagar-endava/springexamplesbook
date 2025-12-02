package com.jetbrains.marco;

import com.jetbrains.marco.config.ProjectConfig;
import com.jetbrains.marco.model.Comment;
import com.jetbrains.marco.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        String value = service.publishComment(comment);

        logger.info(value);
    }
}
