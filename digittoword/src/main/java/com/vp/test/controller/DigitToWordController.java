package com.vp.test.controller;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vp.test.servicedaoimpl.DigitToWordServicedaoimpl;

public class DigitToWordController {

	public static void main(final String[] args) throws Exception {
	
		try {
		int n;
		
		String convertedresult = null;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter a number to convert into word format");
	   
	    	n =s.nextInt();
	    	DigitToWordServicedaoimpl digitToWordervicedaoimpl=new DigitToWordServicedaoimpl();
			
			if(n==0) {
				
				System.out.println("Zero");
			
			}
			
			else {
				
					convertedresult=digitToWordervicedaoimpl.convertToWord(n);
					System.out.println("" +convertedresult);
				}
				
				
			}
		catch(Exception exception) {
			System.out.println("Invalid Entry");
			throw new RuntimeException("Invalid Number");
		}
}
}
