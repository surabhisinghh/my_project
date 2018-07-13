package com.vp.test.servicedaoimpl;

import com.vp.test.daoimpl.DigitToWordDaoimpl;

public class DigitToWordServicedaoimpl {
	public String convertToWord(int n) {
		DigitToWordDaoimpl daoimpl=new DigitToWordDaoimpl();
		String convertedResult=daoimpl.convert(n);
		return convertedResult;
	}


}
