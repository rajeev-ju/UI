package com.db.employeemanagementsystem.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;

class LoginServiceImplTest {
	
	LoginServiceImpl loginServiceImpl = null;

	@Test
	void testAuthenticate(){
	//fail("Not yet implemented");
		loginServiceImpl = new LoginServiceImpl();
		Assertions.assertEquals(true, loginServiceImpl.authenticate(new LoginBean("admin", "root")));
	}

}
