package com.soluticode.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {


    @Value("${app.user}")
    private String user;

    @GetMapping
    public String hello () {
        return "Hello World from UserAPI its " + user;
    }
}
