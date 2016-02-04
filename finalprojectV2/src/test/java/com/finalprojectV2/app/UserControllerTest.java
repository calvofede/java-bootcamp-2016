package com.finalprojectV2.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.finalproject.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:**/rest-servlet.xml" })
public class UserControllerTest {

	@Autowired
	UserService userservice;

	@Test
	@Rollback(false)
	@Transactional
	public void testCreateUser() {
		
		userservice.createUser("Fede", "fede");
		
	}

}
