package com.user.controller;

import com.user.entites.Contact;

import com.user.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private Services service ;

    @GetMapping("/findUserContact/{id}")
    public List<Contact> getUser(@PathVariable("id") Long id){
        return service.getContacts(id) ;
    }
}
