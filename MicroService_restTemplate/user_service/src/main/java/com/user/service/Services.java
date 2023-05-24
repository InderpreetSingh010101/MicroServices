package com.user.service;

import com.user.entites.User;

public interface Services {
    User getUser(Long id);

    void addUser(User adduser);
}
