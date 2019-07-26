package com.db.employeemanagementsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;

class LoginDAOImplTest {
	
	LoginDAOImpl loginDAOImpl = null;
	
	@Test
	void testAuthenticate() {
		//fail("Not yet implemented");
		loginDAOImpl = new LoginDAOImpl();
		Assertions.assertEquals(true, loginDAOImpl.authenticate(new LoginBean("admin","root")));
	}

}
