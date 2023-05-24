package com.user.service;

import com.user.entites.Contact;


import java.util.List;

public interface Services {

    List<Contact> getContacts(Long uid);


    void addUser(Contact adduser);
}
