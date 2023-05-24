package com.user.controller;

import com.user.entites.User;
import com.user.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private Services service ;

    @GetMapping("/getuser/{id}")
    public User getUser(@PathVariable("id") Long id){
        return service.getUser(id) ;
    }
}
