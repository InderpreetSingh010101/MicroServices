package com.user.repository;

import com.user.entites.Contact;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findAllByUid(Long uid) ;
}
