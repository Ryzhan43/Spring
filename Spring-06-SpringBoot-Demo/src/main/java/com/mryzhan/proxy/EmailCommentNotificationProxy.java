package com.mryzhan.proxy;

import com.mryzhan.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendCommand(Comment comment) {
        System.out.println("Sending notification for comment: "+ comment.getText());
    }
}
