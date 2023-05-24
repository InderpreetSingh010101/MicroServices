package com.user.service.impl;


import com.user.dto.ContactDto;
import com.user.entites.User;
import com.user.repository.UserRepository;
import com.user.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ServicesImpl implements Services {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public User getUser(Long id) {
        User fetchedUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Id Not Found"));
        // http://localhost:8080/api/findUserContact/1

        List<ContactDto> contactData = this.restTemplate.getForObject("http://localhost:8080/api/findUserContact/1", List.class);
        fetchedUser.setContactList(contactData);
        return fetchedUser;
    }

    @Override
    public void addUser(User adduser) {
        userRepository.save(adduser);

    }

}
