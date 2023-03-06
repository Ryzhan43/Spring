package com.mryzhan.proxy;

import com.mryzhan.model.Comment;

public interface CommentNotificationProxy{
    void sendCommand(Comment comment);
}
