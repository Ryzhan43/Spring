package com.mryzhan.repository;

import com.mryzhan.model.Comment;

public interface CommentRepository {
    void storeCommand(Comment comment);
}
