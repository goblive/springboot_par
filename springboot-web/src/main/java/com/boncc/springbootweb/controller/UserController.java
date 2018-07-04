package com.boncc.springbootweb.controller;

import com.boncc.User;
import com.boncc.springbootservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("findAll")
    public List<User> findAll(){
        List<User> users = userService.findAll();
        return users;
    }
    public void getAll(){
    	
    }
}
