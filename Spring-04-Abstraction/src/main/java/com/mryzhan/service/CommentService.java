package com.mryzhan.service;

import com.mryzhan.model.Comment;
import com.mryzhan.proxy.CommentNotificationProxy;
import com.mryzhan.repository.CommentRepository;

public class CommentService {
    public final CommentRepository commentRepository;
    public final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publicComment(Comment comment){
        commentRepository.storeCommand(comment);
        commentNotificationProxy.sendCommand(comment);
    }
}
