package com.user;

import com.user.entites.Contact;

import com.user.service.Services;
import com.user.service.impl.ServicesImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private Services services ;

	@Test
	void contextLoads() {
	}

	@Test
	void addUser(){
		Contact contact = new Contact() ;
		contact.setEmail("2ips@ips.com") ;
		contact.setPhone("9898989898");
		contact.setUid(1l);
		services.addUser(contact);
	}

}
