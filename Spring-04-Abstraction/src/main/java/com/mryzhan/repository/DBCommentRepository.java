package com.mryzhan.repository;

import com.mryzhan.model.Comment;

public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeCommand(Comment comment) {
        System.out.println("Sending data to the database: " + comment.getText());
    }
}
