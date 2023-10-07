package com.passwordgenerator.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "user")
public class UserController {


//    private  UserService userService;

    /*public UserController(UserService userService) {
        this.userService = userService;
    }*/

    @GetMapping
    public String hello() {
        return "Hello world!";
    }
}
