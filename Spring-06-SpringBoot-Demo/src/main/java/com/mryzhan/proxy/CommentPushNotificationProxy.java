package com.mryzhan.proxy;

import com.mryzhan.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendCommand(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
