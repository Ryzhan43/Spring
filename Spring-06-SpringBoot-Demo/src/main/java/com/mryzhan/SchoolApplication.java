package com.mryzhan;

import com.mryzhan.model.Comment;
import com.mryzhan.service.CommentService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SchoolApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAutor("Johnson");
        comment.setText("Spring Framework");

        ConfigurableApplicationContext context = SpringApplication.run(SchoolApplication.class, args);

        CommentService cs =  context.getBean(CommentService.class);
        cs.publicComment(comment);
    }

}
