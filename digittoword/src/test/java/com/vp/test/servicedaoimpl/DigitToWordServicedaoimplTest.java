package com.vp.test.servicedaoimpl;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DigitToWordServicedaoimplTest {

	@Test
	public void test() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("One", d1.convertToWord(1));
	}
	@Test
	public void test2() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("Twenty One", d1.convertToWord(21));
	}
	@Test
	public void test3() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("One Hundred Five", d1.convertToWord(105));
	}
	@Test
	public void test4() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("Nine Thousand Nine Hundred Ninety Nine", d1.convertToWord(9999));
	}
	@Test
	public void test5() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("Five Crore Sixty Nine Lakh Forty Five Thousand Seven Hundred Eighty One", d1.convertToWord(56945781));
	}
	
	@Test
	public void test6() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("Ninety Nine Crore Ninety Nine Lakh Ninety Nine Thousand Nine Hundred Ninety Nine", d1.convertToWord(999999999));
	}
	@Rule
	public final ExpectedException e1=ExpectedException.none();
	@Test
	public void test7(){
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();		
	}
	@Test
	public void test8() {
		DigitToWordServicedaoimpl d1=new DigitToWordServicedaoimpl();
				assertEquals("Minus One", d1.convertToWord(-1));
	}
}
