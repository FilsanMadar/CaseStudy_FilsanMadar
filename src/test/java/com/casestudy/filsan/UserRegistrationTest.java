package com.casestudy.filsan;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.casestudy.filsan.controller.UserRegistrationController;


@SpringBootTest
public class UserRegistrationTest {
	
	@Autowired
	private UserRegistrationController controller; 
	
	@Test 
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull(); 
	}

}
