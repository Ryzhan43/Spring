package com.mryzhan.client;

import com.mryzhan.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/", name = "USER-CLIENT")
public interface UserClient{

    @GetMapping("/users")
    List<User> getUsers();


}
