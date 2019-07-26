package com.db.employeemanagementsystem.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DBUtilTest {

	@Test
	void testGetConnection() {
		//fail("Not yet implemented");
		Assertions.assertNotNull(DBUtil.getConnection());
	}

	@Test
	void testCloseConnection() {
		fail("Not yet implemented");
	}

}
