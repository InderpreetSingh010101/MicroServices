package com.user;

import com.user.entites.User;
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
		User addUser = new User() ;
		addUser.setName("Him");
		services.addUser(addUser);
	}

}
