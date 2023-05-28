package com.mryzhan.controller;

import com.mryzhan.client.UserClient;
import com.mryzhan.entity.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class Consume_FeignClient {

    private final UserClient userClient;

    public Consume_FeignClient(UserClient userClient) {
        this.userClient = userClient;
    }

    @GetMapping("/api/v1/users")
    public ResponseEntity<ResponseWrapper> getUsers(){
        return  ResponseEntity.ok(new ResponseWrapper("UserList Retrieved", userClient.getUsers()));
    }


}
