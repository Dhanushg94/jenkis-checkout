package com.iexceed.appzillon;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkisCalctest {

	@Test
	public void addTest() {
		JenkisCalculator myCalc=new JenkisCalculator();
		assertEquals(10,myCalc.addNumber(5, 5));
	}
	
	@Test
	public void subtractTest() {
		JenkisCalculator mySub=new JenkisCalculator();
		assertEquals(5,mySub.subtractNumber(10, 5));
	}

}
