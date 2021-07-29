package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void testingAdd() {
		int res=new Calculator().add(4, 5);
		assertEquals(9, res);
	}

}
