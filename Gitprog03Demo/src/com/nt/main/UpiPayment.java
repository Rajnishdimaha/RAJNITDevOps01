package com.nt.main;

public class UpiPayment {
	
	public static String paymentMethod(String  method,String upiId)
	{      String met1=null;
		if(method.equalsIgnoreCase("phonepay")) {
			met1="using phone pay "+upiId;
		}
		else if(method.equalsIgnoreCase("googlepay")) {
			met1="using google pay "+upiId;
		}
		else if(method.equalsIgnoreCase("paytm")) {
			met1="using payth "+upiId;
		}
		
		return met1;
	}

}
