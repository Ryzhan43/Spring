package com.mryzhan.repository;

import com.mryzhan.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeCommand(Comment comment) {
        System.out.println("Sending data to the database: " + comment.getText());
    }
}
