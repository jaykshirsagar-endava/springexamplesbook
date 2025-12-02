package com.jetbrains.marco.service;

import com.jetbrains.marco.model.Comment;
import com.jetbrains.marco.model.LoggingAspect;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
        return "SUCCESS";
    }
}
