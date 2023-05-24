package com.user.service.impl;


import com.user.entites.Contact;

import com.user.repository.ContactRepository;
import com.user.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesImpl implements Services {


    @Autowired
    private ContactRepository contactRepository ;


    @Override
    public List<Contact> getContacts(Long uid){
        List<Contact> fetchContacts = contactRepository.findAllByUid(uid) ;
        return fetchContacts ;
    }

    @Override
    public void addUser(Contact adduser){
        contactRepository.save(adduser) ;
    }

}
