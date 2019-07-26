package com.db.employeemanagementsystem.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginBeanTest {
	
	LoginBean loginBean = null;
	
	@Test
	void testGetUserName() {
		//fail("Not yet implemented");
		loginBean = new LoginBean("admin", "root");
		Assertions.assertEquals("admin", loginBean.getUserName());
	}

	@Test
	void testGetPassword() {
		
		loginBean = new LoginBean("admin", "root");
		Assertions.assertEquals("root", loginBean.getPassword());
	}

}
