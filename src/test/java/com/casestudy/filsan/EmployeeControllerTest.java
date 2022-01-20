package com.casestudy.filsan;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.casestudy.filsan.rest.EmployeeRestController;



@SpringBootTest
public class EmployeeControllerTest {
	
	@Autowired
	private EmployeeRestController controller; 
	
	@Test 
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull(); 
	}

}
